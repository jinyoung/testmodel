<template>

    <v-data-table
        :headers="headers"
        :items="findInventory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FindInventoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            findInventory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/findInventories'))

            temp.data._embedded.findInventories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.findInventory = temp.data._embedded.findInventories;
        },
        methods: {
        }
    }
</script>

