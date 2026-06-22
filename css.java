* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}

body {
    background-color: #f0f2f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background-color: #ffffff;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
    width: 350px;
}

h2 {
    margin-bottom: 20px;
    text-align: center;
    color: #333;
}

.password-container {
    margin-bottom: 20px;
}

#password {
    width: 100%;
    padding: 12px;
    font-size: 18px;
    text-align: center;
    border: 2px solid #ddd;
    border-radius: 5px;
    background-color: #fafafa;
}

.setting {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-bottom: 15px;
    color: #555;
}

.setting input[type="range"] {
    width: 60%;
}

#generate-btn {
    width: 100%;
    padding: 12px;
    font-size: 16px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-weight: bold;
    transition: background 0.2s;
}

#generate-btn:hover {
    background-color: #0056b3;
}