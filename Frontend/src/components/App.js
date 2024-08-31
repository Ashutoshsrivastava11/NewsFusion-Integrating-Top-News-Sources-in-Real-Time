import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Navbar from './Navbar';
import Home from './Home';
import NewsSection from './NewsSection';
import Footer from './Footer';
import './styles/App.css';

const App = () => {
    return (
        <Router>
            <div className="App">
                <Navbar />
                <Switch>
                    <Route path="/" exact component={Home} />
                    <Route path="/:source" component={NewsSection} />
                </Switch>
                <Footer />
            </div>
        </Router>
    );
}

export default App;
