Imports System.IO

Public Class Form1

    ' The GetData procedure gets data from the text boxes
    ' and stores it in the object referenced by objStudent.
    Private Sub GetData(ByVal objStudent As Student)
        Try
            ' Assign values from the form to the object properties.
            objStudent.LastName = txtLastName.Text
            objStudent.FirstName = txtFirstName.Text
            objStudent.IdNumber = txtIdNumber.Text
            objStudent.TestAverage = CDbl(txtTestAverage.Text)
        Catch ex As Exception
            ' Displaty an error message.
            MessageBox.Show(ex.Message)
        End Try
    End Sub

    Private Sub SaveRecored(ByVal objStudent As Student)
        Dim writer As StreamWriter

        Try
            ' Open the file in Append mode.
            writer = File.AppendText("Students.txt")

            ' Save the Student object's properties.
            writer.WriteLine(objStudent.IdNumber)
            writer.WriteLine(objStudent.FirstName)
            writer.WriteLine(objStudent.LastName)
            writer.WriteLine(objStudent.TestAverage.ToString())
            writer.WriteLine(objStudent.Grade)

            'Close the StreamWriter.
            writer.Close()
        Catch ex As Exception
            'Display an error message.
            MessageBox.Show(ex.Message)
        End Try

    End Sub

    ' The ClearForm procedure clears the form.
    Private Sub ClearForm()
        'Clear the text boxes.
        txtFirstName.Clear()
        txtLastName.Clear()
        txtIdNumber.Clear()
        txtTestAverage.Clear()
        lblGrade.Text = String.Empty

        'Rest the focus.
        txtLastName.Focus()
    End Sub

    Private Sub btnSave_Click(sender As Object, e As EventArgs) Handles btnSave.Click
        ' Create an instance of the Student class.
        Dim objStudent As New Student

        ' Get data from the form.
        GetData(objStudent)

        ' Display the student's grade.
        lblGrade.Text = objStudent.Grade

        ' Save this student's record.
        SaveRecored(objStudent)

        ' Display entered student information.

        Dim StudentList As String

        StudentList = "C:\Users\Gene\source\repos\Student Data\bin\Debug\students.txt"

        Dim objReader As New System.IO.StreamReader(StudentList)

        MessageBox.Show(objReader.ReadToEnd)

        ' Clear the form.
        ClearForm()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        ' Close the form.
        Me.Close()
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        ' Enable output to the Output Window.
        Debug.Listeners.Add(New ConsoleTraceListener())
    End Sub
End Class
