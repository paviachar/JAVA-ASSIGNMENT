<!DOCTYPE html>
<html>
<head>
<title>Student Form</title>

<script>
function validateForm() {
    let marks = document.getElementsByClassName("marks");

    for (let i = 0; i < marks.length; i++) {
        let value = marks[i].value;

        if (value == "" || isNaN(value) || value < 0 || value > 100) {
            alert("Enter valid marks between 0 and 100");
            return false;
        }
    }
    return true;
}
</script>

</head>

<body>

<h2>Student Detail Form</h2>

<form action="ResultServlet" method="post" onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno" required><br><br>
Name: <input type="text" name="name" required><br><br>

Sub1: <input type="text" name="sub1" class="marks"><br><br>
Sub2: <input type="text" name="sub2" class="marks"><br><br>
Sub3: <input type="text" name="sub3" class="marks"><br><br>
Sub4: <input type="text" name="sub4" class="marks"><br><br>
Sub5: <input type="text" name="sub5" class="marks"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>