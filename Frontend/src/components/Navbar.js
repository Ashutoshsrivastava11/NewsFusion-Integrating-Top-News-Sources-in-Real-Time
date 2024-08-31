import React from 'react';
import { Link } from 'react-router-dom';
import '../styles/Navbar.css';  // Adjust path if necessary

const Navbar = () => {
    return (
        <nav className="navbar">
            <h1>News Hub</h1>
            <div className="links">
                <Link to="/">Home</Link>
                <Link to="/the-hindu">The Hindu</Link>
                <Link to="/times-of-india">Times of India</Link>
                <Link to="/jagran">Dainik Jagran</Link>
                <Link to="/nyt">The New York Times</Link>
            </div>
        </nav>
    );
}

export default Navbar;
