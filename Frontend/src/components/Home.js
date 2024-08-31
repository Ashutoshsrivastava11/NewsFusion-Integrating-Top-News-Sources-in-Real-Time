import React from 'react';
import { Link } from 'react-router-dom';
import '../styles/Home.css';  // Adjust path if necessary

const Home = () => {
    return (
        <div className="home">
            <h2>Welcome to News Hub</h2>
            <p>Click on any of the newspaper links to view the latest headlines:</p>
            <ul>
                <li><Link to="/the-hindu">The Hindu</Link></li>
                <li><Link to="/times-of-india">Times of India</Link></li>
                <li><Link to="/jagran">Dainik Jagran</Link></li>
                <li><Link to="/nyt">The New York Times</Link></li>
            </ul>
        </div>
    );
}

export default Home;
