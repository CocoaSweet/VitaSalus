import { makeObservable, observable, action } from "mobx";
import UserAuth from "../types/UserAuth";

class AuthStore {
    isAuthenticated = false
    user: UserAuth = {cpf: ""}

    constructor(){
        makeObservable(this, {
            isAuthenticated: observable,
            user: observable,
            login: action,
            logout: action
        })
    }

    login({cpf}: UserAuth){
        this.isAuthenticated = true
        this.user = {cpf}
        sessionStorage.setItem('cpf', cpf)
    }

    logout(){
        this.isAuthenticated = false
        this.user = {cpf: ""}
        sessionStorage.clear()
        localStorage.clear()
    }

}

const authStore = new AuthStore()
export default authStore