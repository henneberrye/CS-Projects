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
        Me.lstStudents = New System.Windows.Forms.ListBox()
        Me.lstMembers = New System.Windows.Forms.ListBox()
        Me.btnAdd = New System.Windows.Forms.Button()
        Me.btnRemove = New System.Windows.Forms.Button()
        Me.lblGenStudent = New System.Windows.Forms.Label()
        Me.lblMembership = New System.Windows.Forms.Label()
        Me.lblNumber = New System.Windows.Forms.Label()
        Me.lblCount = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lstStudents
        '
        Me.lstStudents.FormattingEnabled = True
        Me.lstStudents.ItemHeight = 24
        Me.lstStudents.Items.AddRange(New Object() {"Adams, Ben", "Baker, Sally", "Canseco, Juan", "Davis, Sharon", "Etienne, Jean", "Gonzalez, Jose", "Johnson, Eric", "Koenig, Johann", "Matsuaga, Akiko", "Nakamura, Ken", "Ramirez, Maria"})
        Me.lstStudents.Location = New System.Drawing.Point(103, 148)
        Me.lstStudents.Margin = New System.Windows.Forms.Padding(6)
        Me.lstStudents.Name = "lstStudents"
        Me.lstStudents.Size = New System.Drawing.Size(593, 724)
        Me.lstStudents.TabIndex = 0
        '
        'lstMembers
        '
        Me.lstMembers.FormattingEnabled = True
        Me.lstMembers.ItemHeight = 24
        Me.lstMembers.Location = New System.Drawing.Point(1133, 148)
        Me.lstMembers.Margin = New System.Windows.Forms.Padding(6)
        Me.lstMembers.Name = "lstMembers"
        Me.lstMembers.Size = New System.Drawing.Size(593, 724)
        Me.lstMembers.TabIndex = 1
        Me.lstMembers.TabStop = False
        '
        'btnAdd
        '
        Me.btnAdd.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnAdd.Location = New System.Drawing.Point(752, 345)
        Me.btnAdd.Margin = New System.Windows.Forms.Padding(6)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(308, 321)
        Me.btnAdd.TabIndex = 2
        Me.btnAdd.Text = "Add Selected Student"
        Me.btnAdd.UseVisualStyleBackColor = True
        '
        'btnRemove
        '
        Me.btnRemove.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnRemove.Location = New System.Drawing.Point(1808, 345)
        Me.btnRemove.Margin = New System.Windows.Forms.Padding(6)
        Me.btnRemove.Name = "btnRemove"
        Me.btnRemove.Size = New System.Drawing.Size(332, 321)
        Me.btnRemove.TabIndex = 3
        Me.btnRemove.Text = "Remove Selected Member"
        Me.btnRemove.UseVisualStyleBackColor = True
        '
        'lblGenStudent
        '
        Me.lblGenStudent.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblGenStudent.Location = New System.Drawing.Point(97, 61)
        Me.lblGenStudent.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblGenStudent.Name = "lblGenStudent"
        Me.lblGenStudent.Size = New System.Drawing.Size(601, 81)
        Me.lblGenStudent.TabIndex = 4
        Me.lblGenStudent.Text = "General Student List"
        '
        'lblMembership
        '
        Me.lblMembership.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblMembership.Location = New System.Drawing.Point(1126, 61)
        Me.lblMembership.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblMembership.Name = "lblMembership"
        Me.lblMembership.Size = New System.Drawing.Size(601, 81)
        Me.lblMembership.TabIndex = 5
        Me.lblMembership.Text = "Club Membership List"
        '
        'lblNumber
        '
        Me.lblNumber.AutoSize = True
        Me.lblNumber.Location = New System.Drawing.Point(1802, 772)
        Me.lblNumber.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblNumber.Name = "lblNumber"
        Me.lblNumber.Size = New System.Drawing.Size(0, 25)
        Me.lblNumber.TabIndex = 6
        '
        'lblCount
        '
        Me.lblCount.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblCount.Location = New System.Drawing.Point(1811, 742)
        Me.lblCount.Name = "lblCount"
        Me.lblCount.Size = New System.Drawing.Size(362, 55)
        Me.lblCount.TabIndex = 7
        Me.lblCount.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(2272, 1200)
        Me.Controls.Add(Me.lblCount)
        Me.Controls.Add(Me.lblNumber)
        Me.Controls.Add(Me.lblMembership)
        Me.Controls.Add(Me.lblGenStudent)
        Me.Controls.Add(Me.btnRemove)
        Me.Controls.Add(Me.btnAdd)
        Me.Controls.Add(Me.lstMembers)
        Me.Controls.Add(Me.lstStudents)
        Me.Margin = New System.Windows.Forms.Padding(6)
        Me.Name = "Form1"
        Me.Text = "Adding Students to a club"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lstStudents As ListBox
    Friend WithEvents lstMembers As ListBox
    Friend WithEvents btnAdd As Button
    Friend WithEvents btnRemove As Button
    Friend WithEvents lblGenStudent As Label
    Friend WithEvents lblMembership As Label
    Friend WithEvents lblNumber As Label
    Friend WithEvents lblCount As Label
End Class
