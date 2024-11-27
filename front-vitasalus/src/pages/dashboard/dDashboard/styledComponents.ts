import { styled } from "styled-components";

export const Container = styled.div`
  padding-top: 30px;
  max-width: 450px;
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  justify-content: center; /* Centraliza os itens horizontalmente */
  align-items: center; /* Centraliza os itens verticalmente */
  gap: 5px; /* Adiciona um espaço entre os quadrados */
  margin: 0 auto;
`;
