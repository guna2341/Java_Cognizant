import React from "react";
import "./App.css";

const books = [
  { id: 101, bname: "Master React", price: 670 },
  { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 103, bname: "Mongo Essentials", price: 450 }
];

const courses = [
  { id: 1, cname: "Angular", date: "4/5/2021" },
  { id: 2, cname: "React", date: "6/3/2021" }
];

const blogs = [
  {
    id: 1,
    title: "React Learning",
    author: "Stephen Biz",
    content: "Welcome to learning React!"
  },
  {
    id: 2,
    title: "Installation",
    author: "Schewzdenier",
    content: "You can install React from npm."
  }
];

function BookDetails(props) {
  const bookdet = (
    <ul>
      {props.books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="column">
      <h1>Book Details</h1>
      {bookdet}
    </div>
  );
}

function BlogDetails(props) {
  let content;

  if (props.show) {
    content = (
      <div>
        {props.blogs.map((blog) => (
          <div key={blog.id}>
            <h2>{blog.title}</h2>
            <h4>{blog.author}</h4>
            <p>{blog.content}</p>
          </div>
        ))}
      </div>
    );
  } else {
    content = <h3>No Blogs Available</h3>;
  }

  return (
    <div className="column">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
}

function CourseDetails(props) {
  return (
    <div className="column">
      <h1>Course Details</h1>

      {props.show ? (
        props.courses.map((course) => (
          <div key={course.id}>
            <h2>{course.cname}</h2>
            <h4>{course.date}</h4>
          </div>
        ))
      ) : (
        <h3>No Courses Available</h3>
      )}
    </div>
  );
}

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div className="container">
      {showCourses && <CourseDetails courses={courses} show={showCourses} />}
      <BookDetails books={books} />
      <BlogDetails blogs={blogs} show={showBlogs} />
    </div>
  );
}

export default App;