import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import WelcomeComponent from './components/WelcomeComponent';
import HomeComponent from './components/HomeComponent';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<WelcomeComponent />} />
          <Route path='/home' element={<HomeComponent/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
