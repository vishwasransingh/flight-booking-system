import { useNavigate } from "react-router-dom";

export default function WelcomeComponent() {

    const navigate = useNavigate();

    function navigateToHome() {
        navigate("/home");
    }

    return(
        <div className="WelcomeComponent">
            <div>
                <h2>Welcome User!</h2>
                <hr/>
                <button className="btn btn-primary m-3" onClick={navigateToHome}>Explore Flights</button>
            </div>
        </div>
    )
}