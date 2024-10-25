import axios from "axios"
import { useMutation, useQueryClient } from "@tanstack/react-query"

const API_URL = 'http://localhost:8080/'

const postData = async (endpoint: string, data: any, header: any): Promise<any> => {
    const response = await axios.post(`${API_URL}${endpoint}`, data, {headers: header || {'Content-Type': 'application/json'}})

    return response
}

export default function UsePost() {
    const queryClient = useQueryClient()

    const mutate = useMutation({
        mutationFn: async ({endpoint, data, header}: {endpoint: string, data: any, header?: string}) => postData(endpoint, data, header),
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries({queryKey: []})
        }
    })
    return mutate
}