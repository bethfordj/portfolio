<template>
    <div class="shopping-list" >
        <h1>{{ name }}</h1>
        <ul>
            <li>{{ bread }}</li>
            <li>butter sticks</li>
            <li>1 bag of cheddar cheese</li>
            <li>1 ranch dressing packet</li>
        </ul>
    </div>
</template>

<script>
export default {
  name: 'ShoppingList',     
  data() {
    return {
      name: "Shopping List",
      bread: "sourdough bread round"
    };
  }
};
</script>

<style scoped>
.shopping-list {
    width:450px;
    background: #fff;
    margin: 50px auto;
    font-family: 'Roboto Condensed', sans-serif;
    border-radius: 10px;
}
h1 {
    background:#f2f2f2;
    color:#5c8578;
    padding:10px;
    font-size:24px;
    text-transform: uppercase;
    text-align: center;
    margin-bottom: 0px;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
}
ul {
    list-style-type: none;
    margin:0px;
    padding:0px;
}
li {
    font-size: 24px;
    border-bottom:1px solid #f2f2f2;
    padding:10px 20px;
}
li:last-child{
    border:0px;
}
li.completed {
    text-decoration: line-through;
    color:darkgrey;
}
</style>