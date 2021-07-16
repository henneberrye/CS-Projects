Public Class DateForm
    Private Sub lblDate_Load(ByVal sender As Object, e As EventArgs) Handles MyBase.Load
        ' Loads date and time in to label.
        lblDate.Text = DateTime.Now.ToString

        ' Starts timer
        tmrDate.Start()

    End Sub
    Private Sub btnClose_Click(sender As Object, e As EventArgs) Handles btnClose.Click
        ' Close the form.
        Me.Close()
    End Sub

    Private Sub tmrDate_Tick(sender As Object, e As EventArgs) Handles tmrDate.Tick
        ' Displays Date and time Keeps time up dated.
        lblDate.Text = DateTime.Now.ToString
    End Sub
End Class