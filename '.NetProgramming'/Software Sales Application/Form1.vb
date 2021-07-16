Public Class Form1
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        Dim decBaseFee As Decimal   ' Yearly License Fee
        Dim decFeaturesSupport As Decimal ' Optional Features lvl 3 Support
        Dim decFeaturesTrainning As Decimal ' Optional Features Trainning
        Dim decFeaturesCloud As Decimal ' Optional Features Cloud Bacup
        Dim decTotalFeaturesFee As Decimal ' Total Optional Features

        ' Constants for base fees.
        Const decYEARLY_FEE As Decimal = 5000D
        Const decONETIME_FEE As Decimal = 20000D

        ' Constants for Optional Features.
        Const decLEVEL3SUPPORT_FEE As Decimal = 3500D
        Const decONSITETRAINNING_FEE As Decimal = 2000D
        Const decCLOUDBACKUP_FEE As Decimal = 300D

        'Determine the Yearly Fee of the One-Time Fee.
        If radYearlyLicense.Checked = True Then
            decBaseFee = decYEARLY_FEE
        ElseIf radOneTimePurchase.Checked = True Then
            decBaseFee = decONETIME_FEE
        End If


        ' Check for Optional Features.
        If chkTechnicalSupport.Checked = True Then
            decFeaturesSupport = decLEVEL3SUPPORT_FEE
        End If

        If chkTrainning.Checked = True Then
            decFeaturesTrainning = decONSITETRAINNING_FEE
        End If

        If chkCloudBackup.Checked = True Then
            decFeaturesCloud = decCLOUDBACKUP_FEE
        End If

        ' Calculate the total Optional Features.
        decTotalFeaturesFee = (decFeaturesSupport + decFeaturesTrainning +
                                                        decFeaturesCloud)


        ' Display the fees.
        lblLicensing.Text = decBaseFee.ToString("c")
        lblFeatures.Text = decTotalFeaturesFee.ToString("c")


    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        ' Reset the Adult radio button.
        radYearlyLicense.Checked = True

        ' Clear the check boxes.
        chkTechnicalSupport.Checked = False
        chkTrainning.Checked = False
        chkCloudBackup.Checked = False


        ' Clear the fee lables.
        lblLicensing.Text = String.Empty
        lblFeatures.Text = String.Empty



    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnClose.Click
        ' Close Form 
        Me.Close()
    End Sub

End Class
