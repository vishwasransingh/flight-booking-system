import { apiClient } from './ApiClient'

/**
 * Contains API calls for CRUD Operations.
 */

export const testHelloApi = () => apiClient.get('/hello');

export const getFlightOffersApi = () => apiClient.post('/offers');