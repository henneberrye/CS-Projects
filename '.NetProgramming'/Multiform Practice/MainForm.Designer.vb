<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MainForm
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
        Me.btnDisplayForm = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.btnName = New System.Windows.Forms.Button()
        Me.btnDate = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'btnDisplayForm
        '
        Me.btnDisplayForm.Location = New System.Drawing.Point(87, 12)
        Me.btnDisplayForm.Name = "btnDisplayForm"
        Me.btnDisplayForm.Size = New System.Drawing.Size(209, 68)
        Me.btnDisplayForm.TabIndex = 0
        Me.btnDisplayForm.Text = "&Display Form"
        Me.btnDisplayForm.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(458, 154)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(219, 68)
        Me.btnExit.TabIndex = 1
        Me.btnExit.Text = "E&xit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'btnName
        '
        Me.btnName.Location = New System.Drawing.Point(87, 126)
        Me.btnName.Name = "btnName"
        Me.btnName.Size = New System.Drawing.Size(209, 70)
        Me.btnName.TabIndex = 2
        Me.btnName.Text = "Display Name"
        Me.btnName.UseVisualStyleBackColor = True
        '
        'btnDate
        '
        Me.btnDate.Location = New System.Drawing.Point(87, 253)
        Me.btnDate.Name = "btnDate"
        Me.btnDate.Size = New System.Drawing.Size(209, 79)
        Me.btnDate.TabIndex = 3
        Me.btnDate.Text = "Display Date"
        Me.btnDate.UseVisualStyleBackColor = True
        '
        'MainForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.btnDate)
        Me.Controls.Add(Me.btnName)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnDisplayForm)
        Me.Name = "MainForm"
        Me.Text = "MainForm.vb"
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents btnDisplayForm As Button
    Friend WithEvents btnExit As Button
    Friend WithEvents btnName As Button
    Friend WithEvents btnDate As Button
End Class
