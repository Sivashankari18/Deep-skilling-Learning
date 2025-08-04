import './App.css';
import { useState } from 'react';
import { books, blogs, courses } from './data';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';


function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div className="App" style={{ display: 'flex', justifyContent: 'space-around' }}>
      {showCourses && <CourseDetails courses={courses} />}
      {showBooks && <BookDetails books={books} />}
      {showBlogs && <BlogDetails blogs={blogs} />}
    </div>
    
  );
}

export default App;


