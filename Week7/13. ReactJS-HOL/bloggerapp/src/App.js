import BlogDetails from "./Components/BlogDetails";
import BookDetails from "./Components/BookDetails";
import CourseDetails from "./Components/CourseDetails";
import "./App.css";

const showCourses = true;

function App() {
  return (
    <div className="App">
      <div className="container">
        <div className="column">
          <h1>Course Details</h1>
          {showCourses && <CourseDetails />}
        </div>

        <div className="column border">
          <h1>Book Details</h1>
          <BookDetails />
        </div>

        <div className="column border">
          <h1>Blog Details</h1>
          <BlogDetails />
        </div>
      </div>
    </div>
  );
}

export default App;
