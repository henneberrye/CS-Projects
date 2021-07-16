<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.radOneTimePurchase = New System.Windows.Forms.RadioButton()
        Me.radYearlyLicense = New System.Windows.Forms.RadioButton()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.chkCloudBackup = New System.Windows.Forms.CheckBox()
        Me.chkTrainning = New System.Windows.Forms.CheckBox()
        Me.chkTechnicalSupport = New System.Windows.Forms.CheckBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.GroupBox4 = New System.Windows.Forms.GroupBox()
        Me.lblFeatures = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.lblLicensing = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnCalculate = New System.Windows.Forms.Button()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox4.SuspendLayout()
        Me.SuspendLayout()
        '
        'radOneTimePurchase
        '
        Me.radOneTimePurchase.AutoSize = True
        Me.radOneTimePurchase.Location = New System.Drawing.Point(23, 114)
        Me.radOneTimePurchase.Margin = New System.Windows.Forms.Padding(6)
        Me.radOneTimePurchase.Name = "radOneTimePurchase"
        Me.radOneTimePurchase.Size = New System.Drawing.Size(214, 29)
        Me.radOneTimePurchase.TabIndex = 1
        Me.radOneTimePurchase.Text = "One-Time Purchase"
        Me.radOneTimePurchase.UseVisualStyleBackColor = True
        '
        'radYearlyLicense
        '
        Me.radYearlyLicense.AutoSize = True
        Me.radYearlyLicense.Checked = True
        Me.radYearlyLicense.Location = New System.Drawing.Point(23, 34)
        Me.radYearlyLicense.Margin = New System.Windows.Forms.Padding(6)
        Me.radYearlyLicense.Name = "radYearlyLicense"
        Me.radYearlyLicense.Size = New System.Drawing.Size(165, 29)
        Me.radYearlyLicense.TabIndex = 0
        Me.radYearlyLicense.TabStop = True
        Me.radYearlyLicense.Text = "Yearly License"
        Me.radYearlyLicense.UseVisualStyleBackColor = True
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.chkCloudBackup)
        Me.GroupBox2.Controls.Add(Me.chkTrainning)
        Me.GroupBox2.Controls.Add(Me.chkTechnicalSupport)
        Me.GroupBox2.Location = New System.Drawing.Point(427, 25)
        Me.GroupBox2.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox2.Size = New System.Drawing.Size(366, 227)
        Me.GroupBox2.TabIndex = 17
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Optional Features (yearly)"
        '
        'chkCloudBackup
        '
        Me.chkCloudBackup.AutoSize = True
        Me.chkCloudBackup.Location = New System.Drawing.Point(36, 168)
        Me.chkCloudBackup.Margin = New System.Windows.Forms.Padding(6)
        Me.chkCloudBackup.Name = "chkCloudBackup"
        Me.chkCloudBackup.Size = New System.Drawing.Size(161, 29)
        Me.chkCloudBackup.TabIndex = 2
        Me.chkCloudBackup.Text = "Cloud Backup"
        Me.chkCloudBackup.UseVisualStyleBackColor = True
        '
        'chkTrainning
        '
        Me.chkTrainning.AutoSize = True
        Me.chkTrainning.Location = New System.Drawing.Point(36, 95)
        Me.chkTrainning.Margin = New System.Windows.Forms.Padding(6)
        Me.chkTrainning.Name = "chkTrainning"
        Me.chkTrainning.Size = New System.Drawing.Size(189, 29)
        Me.chkTrainning.TabIndex = 1
        Me.chkTrainning.Text = "On-site Trainning"
        Me.chkTrainning.UseVisualStyleBackColor = True
        '
        'chkTechnicalSupport
        '
        Me.chkTechnicalSupport.AutoSize = True
        Me.chkTechnicalSupport.Location = New System.Drawing.Point(36, 35)
        Me.chkTechnicalSupport.Margin = New System.Windows.Forms.Padding(6)
        Me.chkTechnicalSupport.Name = "chkTechnicalSupport"
        Me.chkTechnicalSupport.Size = New System.Drawing.Size(267, 29)
        Me.chkTechnicalSupport.TabIndex = 0
        Me.chkTechnicalSupport.Text = "Level-3 Technical Support"
        Me.chkTechnicalSupport.UseVisualStyleBackColor = True
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.radOneTimePurchase)
        Me.GroupBox1.Controls.Add(Me.radYearlyLicense)
        Me.GroupBox1.Location = New System.Drawing.Point(64, 25)
        Me.GroupBox1.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox1.Size = New System.Drawing.Size(351, 227)
        Me.GroupBox1.TabIndex = 16
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Licensing Options"
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(592, 484)
        Me.btnClose.Margin = New System.Windows.Forms.Padding(6)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(138, 42)
        Me.btnClose.TabIndex = 22
        Me.btnClose.Text = "Close"
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.lblFeatures)
        Me.GroupBox4.Controls.Add(Me.Label4)
        Me.GroupBox4.Controls.Add(Me.lblLicensing)
        Me.GroupBox4.Controls.Add(Me.Label2)
        Me.GroupBox4.Location = New System.Drawing.Point(208, 264)
        Me.GroupBox4.Margin = New System.Windows.Forms.Padding(6)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Padding = New System.Windows.Forms.Padding(6)
        Me.GroupBox4.Size = New System.Drawing.Size(522, 168)
        Me.GroupBox4.TabIndex = 19
        Me.GroupBox4.TabStop = False
        Me.GroupBox4.Text = "Membership Fee"
        '
        'lblFeatures
        '
        Me.lblFeatures.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblFeatures.Location = New System.Drawing.Point(346, 106)
        Me.lblFeatures.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblFeatures.Name = "lblFeatures"
        Me.lblFeatures.Size = New System.Drawing.Size(135, 24)
        Me.lblFeatures.TabIndex = 3
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(64, 105)
        Me.Label4.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(228, 25)
        Me.Label4.TabIndex = 2
        Me.Label4.Text = "Cost of optional features:"
        '
        'lblLicensing
        '
        Me.lblLicensing.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.lblLicensing.Location = New System.Drawing.Point(346, 54)
        Me.lblLicensing.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.lblLicensing.Name = "lblLicensing"
        Me.lblLicensing.Size = New System.Drawing.Size(135, 28)
        Me.lblLicensing.TabIndex = 1
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(53, 55)
        Me.Label2.Margin = New System.Windows.Forms.Padding(6, 0, 6, 0)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(239, 25)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Cost of software licensing:"
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(362, 484)
        Me.btnClear.Margin = New System.Windows.Forms.Padding(6)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(138, 42)
        Me.btnClear.TabIndex = 21
        Me.btnClear.Text = "Clea&r"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnCalculate
        '
        Me.btnCalculate.Location = New System.Drawing.Point(139, 484)
        Me.btnCalculate.Margin = New System.Windows.Forms.Padding(6)
        Me.btnCalculate.Name = "btnCalculate"
        Me.btnCalculate.Size = New System.Drawing.Size(138, 42)
        Me.btnCalculate.TabIndex = 20
        Me.btnCalculate.Text = "&Calculate"
        Me.btnCalculate.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(869, 592)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.btnClose)
        Me.Controls.Add(Me.GroupBox4)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.btnCalculate)
        Me.Name = "Form1"
        Me.Text = "Software Sales"
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox4.ResumeLayout(False)
        Me.GroupBox4.PerformLayout()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents radOneTimePurchase As RadioButton
    Friend WithEvents radYearlyLicense As RadioButton
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents chkCloudBackup As CheckBox
    Friend WithEvents chkTrainning As CheckBox
    Friend WithEvents chkTechnicalSupport As CheckBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents btnClose As Button
    Friend WithEvents GroupBox4 As GroupBox
    Friend WithEvents lblFeatures As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents lblLicensing As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents btnClear As Button
    Friend WithEvents btnCalculate As Button
End Class
