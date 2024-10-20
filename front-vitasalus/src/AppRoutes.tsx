import { BrowserRouter, Routes, Route } from "react-router-dom";
import Dashboard from "./pages/dashboard";
import DefaultFormPage from "./pages/defaultFormPage";
import InitialPage from "./pages/initialPage";

export default function AppRoutes(){
    return(
        <BrowserRouter>
        <Routes>
            <Route path = "/inicio" element={<InitialPage/>}/>
            <Route path = "/dashboard" element={<Dashboard/>}/>
            <Route path = "/" element={<DefaultFormPage/>}/>
        </Routes>
        </BrowserRouter>
    )
}