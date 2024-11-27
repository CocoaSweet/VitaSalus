import axios from "axios"
import { useQuery } from "@tanstack/react-query"

const API_URL = 'http://localhost:8080/'

interface Props {
    endpoint: string;
}
const fetchData = async (endpoint : string) => {
    var token = localStorage.getItem('token')
    const response = await axios.get(`${API_URL}${endpoint}`, {headers: {'Content-Type': 'application/json', 'Authorization': `Bearer ${token}`}})
    return response
}

export default function useFetchData({ endpoint }: Props) {
    const query = useQuery({

        queryFn: () => fetchData(endpoint),
        queryKey: ['allData'],
        retry: 2
    })

    return {
        ...query,
        data: query.data?.data
    }
}