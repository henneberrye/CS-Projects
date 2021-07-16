<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.components = New System.ComponentModel.Container()
        Me.lblTotal = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.lblDiscount = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.GroupBox4 = New System.Windows.Forms.GroupBox()
        Me.lblSubtotal = New System.Windows.Forms.Label()
        Me.Panel3 = New System.Windows.Forms.Panel()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.chkStudentDiscount = New System.Windows.Forms.CheckBox()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.btnReset = New System.Windows.Forms.Button()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.ToolTip1 = New System.Windows.Forms.ToolTip(Me.components)
        Me.radCheeseburger = New System.Windows.Forms.RadioButton()
        Me.radHamburger = New System.Windows.Forms.RadioButton()
        Me.chkSoftDrink = New System.Windows.Forms.CheckBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.chkShake = New System.Windows.Forms.CheckBox()
        Me.RadDoubleBurger = New System.Windows.Forms.RadioButton()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox4.SuspendLayout()
        Me.Panel3.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'lblTotal
        '
        Me.lblTotal.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblTotal.Location = New System.Drawing.Point(112, 155)
        Me.lblTotal.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblTotal.Name = "lblTotal"
        Me.lblTotal.Size = New System.Drawing.Size(86, 26)
        Me.lblTotal.TabIndex = 5
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(44, 155)
        Me.Label4.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(56, 25)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "Total"
        '
        'lblDiscount
        '
        Me.lblDiscount.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblDiscount.Location = New System.Drawing.Point(112, 100)
        Me.lblDiscount.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblDiscount.Name = "lblDiscount"
        Me.lblDiscount.Size = New System.Drawing.Size(86, 26)
        Me.lblDiscount.TabIndex = 3
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 100)
        Me.Label3.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(88, 25)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Discount"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(17, 42)
        Me.Label2.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(84, 25)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Subtotal"
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.lblTotal)
        Me.GroupBox4.Controls.Add(Me.Label4)
        Me.GroupBox4.Controls.Add(Me.lblDiscount)
        Me.GroupBox4.Controls.Add(Me.Label3)
        Me.GroupBox4.Controls.Add(Me.lblSubtotal)
        Me.GroupBox4.Controls.Add(Me.Label2)
        Me.GroupBox4.Location = New System.Drawing.Point(45, 195)
        Me.GroupBox4.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox4.Size = New System.Drawing.Size(253, 201)
        Me.GroupBox4.TabIndex = 0
        Me.GroupBox4.TabStop = False
        Me.GroupBox4.Text = "Price"
        '
        'lblSubtotal
        '
        Me.lblSubtotal.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblSubtotal.Location = New System.Drawing.Point(112, 41)
        Me.lblSubtotal.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblSubtotal.Name = "lblSubtotal"
        Me.lblSubtotal.Size = New System.Drawing.Size(86, 24)
        Me.lblSubtotal.TabIndex = 1
        '
        'Panel3
        '
        Me.Panel3.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.Panel3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.Panel3.Controls.Add(Me.GroupBox3)
        Me.Panel3.Controls.Add(Me.GroupBox4)
        Me.Panel3.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Panel3.Location = New System.Drawing.Point(530, 135)
        Me.Panel3.Margin = New System.Windows.Forms.Padding(6)
        Me.Panel3.Name = "Panel3"
        Me.Panel3.Size = New System.Drawing.Size(360, 417)
        Me.Panel3.TabIndex = 6
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.chkStudentDiscount)
        Me.GroupBox3.Location = New System.Drawing.Point(45, 69)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(253, 100)
        Me.GroupBox3.TabIndex = 1
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Discounts"
        '
        'chkStudentDiscount
        '
        Me.chkStudentDiscount.AutoSize = True
        Me.chkStudentDiscount.Location = New System.Drawing.Point(22, 40)
        Me.chkStudentDiscount.Margin = New System.Windows.Forms.Padding(6)
        Me.chkStudentDiscount.Name = "chkStudentDiscount"
        Me.chkStudentDiscount.Size = New System.Drawing.Size(187, 29)
        Me.chkStudentDiscount.TabIndex = 4
        Me.chkStudentDiscount.Text = "Student Discount"
        Me.ToolTip1.SetToolTip(Me.chkStudentDiscount, "Click here to choose Student Discount")
        Me.chkStudentDiscount.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnExit.Location = New System.Drawing.Point(625, 583)
        Me.btnExit.Margin = New System.Windows.Forms.Padding(6)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(138, 42)
        Me.btnExit.TabIndex = 12
        Me.btnExit.Text = "E&xit"
        Me.ToolTip1.SetToolTip(Me.btnExit, "Click here to exit.")
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'btnReset
        '
        Me.btnReset.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnReset.Location = New System.Drawing.Point(466, 583)
        Me.btnReset.Margin = New System.Windows.Forms.Padding(6)
        Me.btnReset.Name = "btnReset"
        Me.btnReset.Size = New System.Drawing.Size(138, 42)
        Me.btnReset.TabIndex = 11
        Me.btnReset.TabStop = False
        Me.btnReset.Text = "&Reset"
        Me.ToolTip1.SetToolTip(Me.btnReset, "Click here to clear the form and start over")
        Me.btnReset.UseVisualStyleBackColor = True
        '
        'btnCalculate
        '
        Me.btnCalculate.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalculate.Location = New System.Drawing.Point(316, 583)
        Me.btnCalculate.Margin = New System.Windows.Forms.Padding(6)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(138, 42)
        Me.btnCalculate.TabIndex = 10
        Me.btnCalculate.Text = "&Calculate Total"
        Me.ToolTip1.SetToolTip(Me.btnCalculate, "Click here to calculate the total of the order.")
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'radCheeseburger
        '
        Me.radCheeseburger.AutoSize = True
        Me.radCheeseburger.Location = New System.Drawing.Point(35, 78)
        Me.radCheeseburger.Margin = New System.Windows.Forms.Padding(6)
        Me.radCheeseburger.Name = "radCheeseburger"
        Me.radCheeseburger.Size = New System.Drawing.Size(230, 29)
        Me.radCheeseburger.TabIndex = 1
        Me.radCheeseburger.TabStop = True
        Me.radCheeseburger.Text = "Cheeseburger ($4.00)"
        Me.ToolTip1.SetToolTip(Me.radCheeseburger, "Click here to choose a whole wheat Bagel.")
        Me.radCheeseburger.UseVisualStyleBackColor = True
        '
        'radHamburger
        '
        Me.radHamburger.AutoSize = True
        Me.radHamburger.Checked = True
        Me.radHamburger.Location = New System.Drawing.Point(35, 35)
        Me.radHamburger.Margin = New System.Windows.Forms.Padding(6)
        Me.radHamburger.Name = "radHamburger"
        Me.radHamburger.Size = New System.Drawing.Size(202, 29)
        Me.radHamburger.TabIndex = 0
        Me.radHamburger.TabStop = True
        Me.radHamburger.Text = "Hamburger ($3.00)"
        Me.ToolTip1.SetToolTip(Me.radHamburger, "Click here to choose a Hamburger")
        Me.radHamburger.UseVisualStyleBackColor = True
        '
        'chkSoftDrink
        '
        Me.chkSoftDrink.AutoSize = True
        Me.chkSoftDrink.Location = New System.Drawing.Point(11, 35)
        Me.chkSoftDrink.Margin = New System.Windows.Forms.Padding(6)
        Me.chkSoftDrink.Name = "chkSoftDrink"
        Me.chkSoftDrink.Size = New System.Drawing.Size(191, 29)
        Me.chkSoftDrink.TabIndex = 0
        Me.chkSoftDrink.Text = "Soft Drink ($1.00)"
        Me.ToolTip1.SetToolTip(Me.chkSoftDrink, "Click here to choose a soft drink")
        Me.chkSoftDrink.UseVisualStyleBackColor = True
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.chkShake)
        Me.GroupBox2.Controls.Add(Me.chkSoftDrink)
        Me.GroupBox2.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox2.Location = New System.Drawing.Point(44, 229)
        Me.GroupBox2.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox2.Size = New System.Drawing.Size(282, 167)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Drinks and Discount"
        Me.ToolTip1.SetToolTip(Me.GroupBox2, "Select a drink and discount if applicable")
        '
        'chkShake
        '
        Me.chkShake.AutoSize = True
        Me.chkShake.Location = New System.Drawing.Point(11, 78)
        Me.chkShake.Margin = New System.Windows.Forms.Padding(6)
        Me.chkShake.Name = "chkShake"
        Me.chkShake.Size = New System.Drawing.Size(163, 29)
        Me.chkShake.TabIndex = 1
        Me.chkShake.Text = "Shake ($2.00)"
        Me.ToolTip1.SetToolTip(Me.chkShake, "Click here to choose a shake")
        Me.chkShake.UseVisualStyleBackColor = True
        '
        'RadDoubleBurger
        '
        Me.RadDoubleBurger.AutoSize = True
        Me.RadDoubleBurger.Location = New System.Drawing.Point(35, 128)
        Me.RadDoubleBurger.Name = "RadDoubleBurger"
        Me.RadDoubleBurger.Size = New System.Drawing.Size(228, 29)
        Me.RadDoubleBurger.TabIndex = 2
        Me.RadDoubleBurger.TabStop = True
        Me.RadDoubleBurger.Text = "Double burger ($5.00)"
        Me.ToolTip1.SetToolTip(Me.RadDoubleBurger, "Click here for a double burger")
        Me.RadDoubleBurger.UseVisualStyleBackColor = True
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.RadDoubleBurger)
        Me.GroupBox1.Controls.Add(Me.radCheeseburger)
        Me.GroupBox1.Controls.Add(Me.radHamburger)
        Me.GroupBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(44, 52)
        Me.GroupBox1.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox1.Size = New System.Drawing.Size(282, 166)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Pick a Burger"
        '
        'Panel1
        '
        Me.Panel1.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.Panel1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.Panel1.Controls.Add(Me.GroupBox2)
        Me.Panel1.Controls.Add(Me.GroupBox1)
        Me.Panel1.Location = New System.Drawing.Point(127, 135)
        Me.Panel1.Margin = New System.Windows.Forms.Padding(6)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(391, 417)
        Me.Panel1.TabIndex = 8
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 24.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(232, 9)
        Me.Label1.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(597, 64)
        Me.Label1.TabIndex = 7
        Me.Label1.Text = "Braindi's Bagel House"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1050, 858)
        Me.Controls.Add(Me.Panel3)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnReset)
        Me.Controls.Add(Me.btnCalculate)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Label1)
        Me.Margin = New System.Windows.Forms.Padding(6)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox4.ResumeLayout(False)
        Me.GroupBox4.PerformLayout()
        Me.Panel3.ResumeLayout(False)
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.Panel1.ResumeLayout(False)
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblTotal As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents lblDiscount As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents GroupBox4 As GroupBox
    Friend WithEvents lblSubtotal As Label
    Friend WithEvents Panel3 As Panel
    Friend WithEvents ToolTip1 As ToolTip
    Friend WithEvents btnExit As Button
    Friend WithEvents btnReset As Button
    Friend WithEvents btnCalculate As Button
    Friend WithEvents radCheeseburger As RadioButton
    Friend WithEvents radHamburger As RadioButton
    Friend WithEvents chkSoftDrink As CheckBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents Panel1 As Panel
    Friend WithEvents Label1 As Label
    Friend WithEvents RadDoubleBurger As RadioButton
    Friend WithEvents chkStudentDiscount As CheckBox
    Friend WithEvents chkShake As CheckBox
    Friend WithEvents GroupBox3 As GroupBox
End Class
