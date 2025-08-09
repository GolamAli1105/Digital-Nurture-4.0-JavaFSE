const selectedBlog = 'react';

const BlogDetails = ()=>{

  return(
    <div>
  {selectedBlog === 'react' ? (
  <div>
    <h2>React Learning</h2>
    <b>Stephen Biz</b>
    <p>Welcome to learning React!</p>
    <h2>Installation</h2>
    <b>Schewzdenier</b>
    <p>You can install React from npm.</p>
  </div>
) : (
  <p>No blog found</p>
)}
  
  </div>
)}

export default BlogDetails;