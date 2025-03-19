document.addEventListener("DOMContentLoaded", function() {
    const submitButton = document.getElementById("submit-btn");

    if (submitButton) {
        submitButton.addEventListener("click", function() {
            fetch("/submit", {
                method: "POST"
            })
            .then(response => {
                if (response.ok) {
                    alert("Form submitted successfully!");
                } else {
                    alert("Error submitting form.");
                }
            })
            .catch(error => console.error("Error:", error));
        });
    }
});
