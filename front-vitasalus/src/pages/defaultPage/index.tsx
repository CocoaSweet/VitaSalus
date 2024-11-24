import { Outlet } from "react-router-dom";
import { Header } from "./styledComponents";

export default function DefaultPage(){
    return(
        <>
        <Header/>
        <main>
            <Outlet/>
        </main>
        </>
    )
}