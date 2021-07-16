Public Class MainForm
    Private Sub btnDisplayForm_Click(sender As Object, e As EventArgs) Handles btnDisplayForm.Click
        ' create an instance of MessageForm.
        Dim frmMessage As New MessageForm

        'Display the form in modal style.
        frmMessage.ShowDialog()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'Close form.
        Me.Close()
    End Sub

    Private Sub btnName_Click(sender As Object, e As EventArgs) Handles btnName.Click
        ' Creat and instance of NameForm.
        Dim frmName As New NameForm

        ' Display the form in modal style.
        frmName.ShowDialog()
    End Sub

    Private Sub btnDate_Click(sender As Object, e As EventArgs) Handles btnDate.Click
        ' Creat an instance of the DateForm
        Dim frmDate As New DateForm

        ' Display the form in modal style
        frmDate.ShowDialog()
    End Sub
End Class
