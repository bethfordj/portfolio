<template>
  <div class="books">
    <p>This is alist of other books you might enjoy.</p>
    <books-list />
  </div>
</template>

<script>
import BooksList from "@/components/BooksList";

export default {
  components: {
    BooksList
  }
};
</script>
