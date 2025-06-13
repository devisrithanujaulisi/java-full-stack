import logo from './logo.svg';
import './App.css';
import Intro from './Intro.js';
import Form from './Form.js';
import Sviet from'./Sviet.js';
function App() {
  return (
    <div className="App">
      <header className="sviet">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png" className="App-logo" alt="logo" />
        <p>
        SVIET
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          sviet website
        </a>
        <intro/>
        <Form/>
        <Sviet title="Empowering minds"/>
      </header>
    </div>
  );
}

export default App;
