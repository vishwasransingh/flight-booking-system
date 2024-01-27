import { getFlightOffersApi } from "./api/FlightApiService"

export default function HomeComponent() {

    function handleGetFlightOffers() {
        getFlightOffersApi();
    }

    return (
        <div>
            <button className="btn btn-primary m-3" onClick={handleGetFlightOffers}>Get Offers</button>
        </div>
    )
}