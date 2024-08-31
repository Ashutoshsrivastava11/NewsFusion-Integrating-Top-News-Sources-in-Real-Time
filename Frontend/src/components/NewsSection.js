import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import '../styles/NewsSection.css';  // Adjust path if necessary

const NewsSection = () => {
    const { source } = useParams();
    const [news, setNews] = useState([]);

    useEffect(() => {
        fetch(`/api/news/${source}`)
            .then(response => response.json())
            .then(data => setNews(data));
    }, [source]);

    return (
        <div className="news-section">
            <h2>{source.replace('-', ' ').toUpperCase()}</h2>
            <ul>
                {news.map((item) => (
                    <li key={item.id}>{item.title}</li>
                ))}
            </ul>
        </div>
    );
}

export default NewsSection;
