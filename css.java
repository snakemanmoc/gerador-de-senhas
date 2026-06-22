/* Importando uma fonte moderna */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap');

:root {
    --primary-color: #4a69bd;
    --primary-hover: #3c55a5;
    --bg-color: #f4f6f9;
    --container-bg: #ffffff;
    --text-main: #2d3436;
    --text-muted: #636e72;
    --border-color: #dfe6e9;
    --shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
}

* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: 'Poppins', sans-serif;
}

body {
    background-color: var(--bg-color);
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
}

.container {
    background-color: var(--container-bg);
    padding: 40px;
    border-radius: 16px;
    box-shadow: var(--shadow);
    width: 100%;
    max-width: 450px;
}

header {
    text-align: center;
    margin-bottom: 30px;
}

h1 {
    font-size: 24px;
    color: var(--text-main);
    margin-bottom: 8px;
}

h1 i {
    color: var(--primary-color);
    margin-right: 8px;
}

header p {
    color: var(--text-muted);
    font-size: 14px;
}

.result-container {
    background-color: #f8f9fa;
    border: 2px solid var(--border-color);
    border-radius: 12px;
    display: flex;
    justify-content: space-between;
    align-items: center;
    padding: 10px 15px;
    margin-bottom: 25px;
    position: relative;
    transition: border-color 0.3s;
}

.result-container:focus-within {
    border-color: var(--primary-color);
}

#password {
    background: transparent;
    border: none;
    outline: none;
    color: var(--text-main);
    font-size: 18px;
    font-weight: bold;
    width: 85%;
    letter-spacing: 1px;
}

.btn {
    border: none;
    cursor: pointer;
    transition: all 0.2s ease-in-out;
    outline: none;
}

.copy-btn {
    background: none;
    color: var(--text-muted);
    font-size: 18px;
    padding: 5px;
}

.copy-btn:hover {
    color: var(--primary-color);
    transform: scale(1.1);
}

.options {
    margin-bottom: 30px;
}

.option-group {
    margin-bottom: 20px;
}

.option-group label {
    display: block;
    font-size: 14px;
    font-weight: 600;
    color: var(--text-main);
    margin-bottom: 10px;
}

#length {
    width: 100%;
    cursor: pointer;
}

/* Checkbox Moderno */
.checkbox-group {
    display: flex;
    flex-direction: column;
    gap: 12px;
}

.checkbox-container {
    display: block;
    position: relative;
    padding-left: 30px;
    cursor: pointer;
    font-size: 14px;
    color: var(--text-main);
    user-select: none;
}

.checkbox-container input {
    position: absolute;
    opacity: 0;
    cursor: pointer;
    height: 0;
    width: 0;
}

.checkmark {
    position: absolute;
    top: 0;
    left: 0;
    height: 18px;
    width: 18px;
    background-color: #eee;
    border-radius: 4px;
    transition: background-color 0.2s;
}

.checkbox-container:hover input ~ .checkmark {
    background-color: #ccc;
}

.checkbox-container input:checked ~ .checkmark {
    background-color: var(--primary-color);
}

.checkmark:after {
    content: "";
    position: absolute;
    display: none;
}

.checkbox-container input:checked ~ .checkmark:after {
    display: block;
}

.checkbox-container .checkmark:after {
    left: 6px;
    top: 3px;
    width: 5px;
    height: 10px;
    border: solid white;
    border-width: 0 2px 2px 0;
    transform: rotate(45deg);
}

.generate-btn {
    width: 100%;
    padding: 15px;
    font-size: 16px;
    font-weight: 600;
    background-color: var(--primary-color);
    color: white;
    border-radius: 12px;
    box-shadow: 0 4px 6px rgba(74, 105, 189, 0.3);
}

.generate-btn:hover {
    background-color: var(--primary-hover);
    box-shadow: 0 6px 12px rgba(74, 105, 189, 0.4);
}

.generate-btn:active {
    transform: translateY(1px);
}