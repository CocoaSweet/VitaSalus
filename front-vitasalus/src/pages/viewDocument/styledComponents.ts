import { styled } from "styled-components";

// Página principal com dimensões de A4
export const Page = styled.div`
    background: white;
    display: block;
    margin-bottom: 0.5cm;
    margin: 0 auto;
    padding: 2cm;
    box-shadow: 0 0 0.5cm rgba(0, 0, 0, 0.5);
    width: 21cm;
    height: 29.7cm;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    margin-top: 20px;
    
`;

// Cabeçalho com o título centralizado
export const HeaderSection = styled.div`
    text-align: center;
    margin-bottom: 1cm;
    margin-top: 20px;
    padding: 20px;
`;

export const InfoSection = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    font-size: 0.9em;
    line-height: 1.5em;
    margin-bottom: 2cm;
    border-bottom: 1px solid black;
    padding-bottom: 1cm;
`

export const Row = styled.div`
    display: flex;
    justify-content: space-between;
    font-size: 1em;
    margin-bottom: 0.5cm;
`

export const ContentSection = styled.div`
    flex: 1;
    font-size: 1em;
    text-align: justify;
`

export const FooterSection = styled.div`
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 2cm;
    border-top: 1px solid black;
    padding-top: 1cm;

    img {
        margin-right: 0.5cm;
    }

    p {
        font-size: 3em;
        font-weight: bold;
        margin: 0;
    }
`

export const Title = styled.h1`
    font-size: 1.5em;
    font-weight: bold;
    margin: 0;
`

export const Text = styled.p`
    font-size: 1em;
    margin: 0;
    line-height: 1.5;
    text-align: center;
`

