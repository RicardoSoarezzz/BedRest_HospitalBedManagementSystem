function loadHtml(id, folder, filename) {
    console.log(`div id: ${id}, folder: ${folder}, filename: ${filename}`);

    let xhttp;
    let element = document.getElementById(id);
    let folderPath = folder ? `${folder}/` : ''; // Include folder path if specified
    let file = filename;


    if (file) {
        xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
            if (this.readyState == 4) {
                if (this.status == 200) {
                    element.innerHTML = this.responseText;
                }
                if (this.status == 404) {
                    element.innerHTML = "<h1>Page not found.</h1>";
                }
            }
        }



        xhttp.open("GET", `${folderPath}${file}`, true); // Adjust the path here
        xhttp.send();
        return;
    }

}
