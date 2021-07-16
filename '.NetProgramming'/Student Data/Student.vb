Public Class Student
    ' Member variables
    Private strLastName As String       ' Holds last name
    Private strFirstName As String      ' Holds first name
    Private strId As String             ' Holds ID number
    Private dblTestAverage As Double    ' Holds test average

    ' Constructor
    Public Sub New()
        Debug.WriteLine("Student object being created.")
        strFirstName = ("unknown")
        strLastName = ("unknown")
        strId = ("unknown")
        dblTestAverage = 0.0
    End Sub

    'LastName property procedure
    Public Property LastName() As String
        Get
            Return strLastName
        End Get
        Set(ByVal value As String)
            strLastName = value
        End Set
    End Property

    ' FirstName property procedure
    Public Property FirstName() As String
        Get
            Return strFirstName
        End Get
        Set(ByVal value As String)
            strFirstName = value
        End Set
    End Property

    ' IdNumber property procedure
    Public Property IdNumber() As String
        Get
            Return strId
        End Get
        Set(ByVal value As String)
            strId = value
        End Set
    End Property

    ' TestAverage property procedure
    Public Property TestAverage() As Double
        Get
            Return dblTestAverage
        End Get
        Set(ByVal value As Double)
            dblTestAverage = value
        End Set
    End Property

    ' Grade read only property procedure
    Public ReadOnly Property Grade() As String
        Get
            ' Variable to hold the grade.
            Dim strGrade As String

            ' Determine the grade
            If dblTestAverage >= 90.0 Then
                strGrade = "A"
            ElseIf dblTestAverage >= 80.0 Then
                strGrade = "B"
            ElseIf dblTestAverage >= 70.0 Then
                strGrade = "C"
            ElseIf dblTestAverage >= 60.0 Then
                strGrade = "D"
            Else
                strGrade = "F"
            End If

            ' Return the grade.
            Return strGrade
        End Get
    End Property
End Class
