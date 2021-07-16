<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DateForm
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
        Me.lblDate = New System.Windows.Forms.Label()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.tmrDate = New System.Windows.Forms.Timer(Me.components)
        Me.SuspendLayout()
        '
        'lblDate
        '
        Me.lblDate.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblDate.Location = New System.Drawing.Point(232, 120)
        Me.lblDate.Name = "lblDate"
        Me.lblDate.Size = New System.Drawing.Size(285, 58)
        Me.lblDate.TabIndex = 0
        Me.lblDate.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(278, 218)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(193, 47)
        Me.btnClose.TabIndex = 1
        Me.btnClose.Text = "&Close"
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'tmrDate
        '
        Me.tmrDate.Enabled = True
        '
        'DateForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.btnClose)
        Me.Controls.Add(Me.lblDate)
        Me.Name = "DateForm"
        Me.Text = "DateForm"
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents lblDate As Label
    Friend WithEvents btnClose As Button
    Friend WithEvents tmrDate As Timer
End Class
