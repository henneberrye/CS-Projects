Imports System.Diagnostics.Eventing.Reader

Public Class Form1
    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles lblGenStudent.Click

    End Sub

    Private Sub lblMembership_Click(sender As Object, e As EventArgs) Handles lblMembership.Click

    End Sub

    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click

        ' Prevent Runtime error if a name isn't selected
        If lstStudents.SelectedIndex = -1 Then Exit Sub

        'Add selected name to member list.
        'Count number of names in the member list.
        'Stop name from being added more than once

        Dim name As String = lstStudents.SelectedItem.ToString()
        If Not lstMembers.Items.Contains(name) Then
            lstMembers.Items.Add(lstStudents.SelectedItem)
            lblCount.Text = lstMembers.Items.Count.ToString() & " memeber"
        End If
    End Sub

    Private Sub btnRemove_Click(sender As Object, e As EventArgs) Handles btnRemove.Click

        ' Remove selected name from list.

        Dim index As Integer = lstMembers.SelectedIndex
        If index <> -1 Then
            lstMembers.Items.RemoveAt(index)
        End If

        ' Count members in list
        lblCount.Text = lstMembers.Items.Count.ToString() & " members"
    End Sub

    Private Sub lstStudents_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstStudents.SelectedIndexChanged

    End Sub

    Private Sub lblCount_Click(sender As Object, e As EventArgs) Handles lblCount.Click

    End Sub

    Private Sub lstMembers_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lstMembers.SelectedIndexChanged

    End Sub
End Class