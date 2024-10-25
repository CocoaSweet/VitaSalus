import styled from "styled-components";

const Pressable = styled.a`
color: #406892;
border: none;
margin-top: 2px;
font-weight: 700;
line-height: 19px;
textAlign: 'center';
text-decoration: none;
display: inline-block;
`

interface Props {
    title: string,
    href: string;
}

export default function RegisterButton({href, title}: Props){
    return(
        <>
        <Pressable href={href}>{title}</Pressable>
        </>
    )
}