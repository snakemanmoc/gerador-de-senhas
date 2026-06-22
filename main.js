const passwordEl = document.getElementById('password');
const lengthEl = document.getElementById('length');
const lengthValEl = document.getElementById('length-val');
const uppercaseEl = document.getElementById('uppercase');
const lowercaseEl = document.getElementById('lowercase');
const numbersEl = document.getElementById('numbers');
const symbolsEl = document.getElementById('symbols');
const generateBtn = document.getElementById('generate-btn');
const copyBtn = document.getElementById('copy');

const uppercaseChars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
const lowercaseChars = 'abcdefghijklmnopqrstuvwxyz';
const numberChars = '0123456789';
const symbolChars = '!@#$%^&*()_+~`|}{[]:;?><,./-=';

// Atualiza o valor numérico do comprimento na tela
lengthEl.addEventListener('input', (e) => {
    lengthValEl.innerText = e.target.value;
});

// Função para gerar a senha segura
function generatePassword() {
    let allowedChars = '';
    let password = '';

    if (uppercaseEl.checked) allowedChars += uppercaseChars;
    if (lowercaseEl.checked) allowedChars += lowercaseChars;
    if (numbersEl.checked) allowedChars += numberChars;
    if (symbolsEl.checked) allowedChars += symbolChars;

    const length = parseInt(lengthEl.value);

    if (allowedChars.length === 0) {
        passwordEl.value = 'Selecione uma opção!';
        return;
    }

    // Gerando a senha com base nas opções e comprimento selecionados
    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * allowedChars.length);
        password += allowedChars[randomIndex];
    }

    passwordEl.value = password;
}

// Função inovadora para copiar a senha para a área de transferência
copyBtn.addEventListener('click', () => {
    const password = passwordEl.value;

    if (!password || password === 'Selecione uma opção!') {
        return;
    }

    // Copiando para a área de transferência usando a Clipboard API moderna
    navigator.clipboard.writeText(password).then(() => {
        // Feedback visual para o usuário
        const originalIcon = copyBtn.innerHTML;
        copyBtn.innerHTML = '<i class="fas fa-check" style="color: #2ecc71;"></i>';
        
        // Retorna o ícone original após 2 segundos
        setTimeout(() => {
            copyBtn.innerHTML = originalIcon;
        }, 2000);
    });
});

generateBtn.addEventListener('click', generatePassword);

// Gera uma senha inicial ao carregar a página
generatePassword();