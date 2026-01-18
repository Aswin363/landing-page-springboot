const params = new URLSearchParams(window.location.search);

if (params.get("success") === "true") {
    document.getElementById("successMsg").style.display = "block";
}
