import { BrowserRouter, Routes, Route } from "react-router-dom";
import Dashboard from "./pages/dashboard";
import DefaultFormPage from "./pages/defaultFormPage";
import InitialPage from "./pages/initialPage";
import PatientLogin from "./pages/login/patientLogin";
import DoctorLogin from "./pages/login/doctorLogin";

export default function AppRoutes(){
    return(
        <BrowserRouter>
        <Routes>
            <Route path = "/" element={<InitialPage/>}>
                <Route index element={<Dashboard/>}/>
            </Route>
            <Route path = "/" element={<DefaultFormPage/>}>
                <Route path = "/loginPaciente" element={<PatientLogin/>}/>
                <Route path = "/loginMedico" element={<DoctorLogin/>}/>
            </Route>
        </Routes>
        </BrowserRouter>
    )
}