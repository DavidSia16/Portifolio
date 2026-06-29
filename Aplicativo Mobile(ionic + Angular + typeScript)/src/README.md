# ⛽ Fuel Calculator App

Aplicativo mobile desenvolvido com Ionic e Angular que auxilia motoristas a escolherem o combustível mais vantajoso entre gasolina e etanol, utilizando a regra dos 70%.

## 📱 Sobre o Projeto

O aplicativo permite que o usuário informe os preços da gasolina e do etanol e, automaticamente, calcula qual opção oferece o melhor custo-benefício.

O projeto foi desenvolvido com o objetivo de praticar desenvolvimento mobile híbrido, componentização e lógica de programação utilizando o ecossistema Angular.

## 🚀 Tecnologias Utilizadas

- Ionic Framework
- Angular
- TypeScript
- HTML5
- SCSS
- Capacitor

## ✨ Funcionalidades

- ✅ Cálculo automático entre gasolina e etanol
- ✅ Validação dos campos de entrada
- ✅ Interface simples e intuitiva
- ✅ Design responsivo para dispositivos móveis
- ✅ Exibição da melhor opção de combustível

## 🧮 Como funciona?

A aplicação utiliza a regra dos 70%:

> Se o preço do etanol for menor que 70% do valor da gasolina, o etanol é a melhor opção. Caso contrário, recomenda-se a gasolina.

Fórmula utilizada:

```javascript
const resultado = etanol / gasolina;

if (resultado < 0.7) {
    return "Abasteça com Etanol";
}

return "Abasteça com Gasolina";
