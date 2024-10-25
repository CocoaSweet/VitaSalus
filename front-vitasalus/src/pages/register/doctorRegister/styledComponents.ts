import { styled } from "styled-components";

interface Props{
    color: string;
}
export const CustomizedStep = styled.div<Props>`
    background-color: ${({color}) => color};
    width: 16px;
    height: 16px;
    border-radius: 50%;
`

export const DivLogo = styled.div`
margin-bottom: 2px;
`