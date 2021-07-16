Public Class Form1
    ' Class-level declarations
    Const dec_Discount As Decimal = 0.1D         ' Student Discount
    Const dec_Burger As Decimal = 3D            ' Cost of a Burger
    Const decCheeseBurger As Decimal = 4D       ' Cost of a Cheeseburger
    Const decDoubleBurger As Decimal = 5D       ' Cost of a Doubleburger
    Const decSoftDrink As Decimal = 1D          ' Cost of a soft drink
    Const decShake As Decimal = 2D              ' Cost of a shake

    Function CalcBurgerCost() As Decimal
        ' This function returns the cost of the selected buger.
        Dim decBurger As Decimal

        If radHamburger.Checked = True Then
            decBurger = dec_Burger
        ElseIf radCheeseburger.Checked = True Then
            decBurger = decCheeseBurger
        ElseIf radDoubleBurger.Checked = True Then
            decBurger = decDoubleBurger
        End If

        Return decBurger
    End Function

    Function CalcDrinkCost() As Decimal
        ' This function returns the cost of the drinks.
        Dim decCostOfDrinks As Decimal = 0D

        If chkSoftDrink.Checked = True Then
            decCostOfDrinks += decSoftDrink
        End If

        If chkShake.Checked = True Then
            decCostOfDrinks = decShake
        End If

        Return decCostOfDrinks
    End Function

    Function CalcDiscount() As Decimal
        ' This function returns the discount
        Dim decAmountDiscount As Decimal

        If chkStudentDiscount.Checked = True Then
            decAmountDiscount = dec_Discount
        Else
            chkStudentDiscount.Checked = False
        End If
        Return dec_Discount

    End Function

    Function CalcDiscount(ByVal decAmount As Decimal) As Decimal
        ' This function receives the sale amount and 
        ' returns the amount of sales tax.
        Return decAmount * dec_Discount
    End Function

    Sub ResetBurgers()
        ' This procedure resets the burger selection.
        radHamburger.Checked = True
    End Sub

    Sub ResetDrinksDiscount()
        ' This procedure resets the drinks selection.
        chkSoftDrink.Checked = False
        chkShake.Checked = False
    End Sub

    Sub ResetDiscounts()
        ' This procedure resets the discount
        chkStudentDiscount.Checked = False
    End Sub
    Sub ResetPrice()
        ' This procedure resets the price.
        lblSubtotal.Text = String.Empty
        lblDiscount.Text = String.Empty
        lblTotal.Text = String.Empty
    End Sub

    Private Sub btnReset_Click(sender As Object, e As EventArgs) Handles btnReset.Click
        ' This procedure resets the controls to default values.
        ResetBurgers()
        ResetDrinksDiscount()
        ResetPrice()
        ResetDiscounts()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        ' Close the form
        Me.Close()
    End Sub

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        ' This procedure calculates the total of an order.
        Dim decSubTotal As Decimal  ' Holds the order subtotal
        Dim decDiscount As Decimal  ' Holds the Discount Ammount
        Dim decTotal As Decimal     ' Holds the order total

        If chkStudentDiscount.Checked = True Then
            decSubTotal = CalcBurgerCost() + CalcDrinkCost()
            decDiscount = CalcDiscount(decSubTotal)
            decTotal = decSubTotal - decDiscount
        Else
            decSubTotal = CalcBurgerCost() + CalcDrinkCost()
            decTotal = CalcBurgerCost() + CalcDrinkCost()
        End If


        lblSubtotal.Text = decSubTotal.ToString("c")
        If chkStudentDiscount.Checked = True Then
            lblDiscount.Text = decDiscount.ToString("c")
        End If
        lblTotal.Text = decTotal.ToString("c")
    End Sub

    Private Sub Label3_Click(sender As Object, e As EventArgs) Handles Label3.Click

    End Sub
End Class
