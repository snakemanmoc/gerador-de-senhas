const passwordEl = document.getElementById('password');
const lengthEl = document.getElementById('length');
const lengthValEl = document.getElementById('length-val');
const uppercaseEl = document.getElementById('uppercase');
const lowercaseEl = document.getElementById('lowercase');
const numbersEl = document.getElementById('numbers');
const symbolsEl = document.getElementById('symbols');
const generateBtn = document.getElementById('generate-btn');

const uppercaseChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
const lowercaseChars = 'abcdefghijklmnopqrstuvwxyz';
const numberChars = '0123456789';
const symbolChars = '!@#$%^&*()_+~`|}{[]:;?><,./-=';

// Atualiza o número do comprimento na tela quando arrasta o slider
lengthEl.addEventListener('input', (e) => {
    lengthValEl.innerText = e.target.value;
});

// Função principal para gerar a senha
function generatePassword() {
    let allowedChars = '';
    let password = '';

    if (uppercaseEl.checked) allowedChars += uppercaseChars;
    if (lowercaseEl.checked) allowedChars += lowercaseChars;
    if (numbersEl.checked) allowedChars += numberChars;
    if (symbolsEl.checked) allowedChars += symbolChars;

    const length = parseInt(lengthEl.value);

    if (allowedChars.length === 0) {
        passwordEl.value = 'Selecione pelo menos uma opção!';
        return;
    }

    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * allowedChars.length);
        password += allowedChars[randomIndex];
    }

    passwordEl.value = password;
}

// Evento do botão
generateBtn.addEventListener('click', generatePassword);