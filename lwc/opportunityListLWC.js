//lwc.js
import { LightningElement, wire } from 'lwc';
import getOpenOpportunities from '@salesforce/apex/OpportunityController.getOpenOpportunities';

export default class OpportunityList extends LightningElement {
    @wire(getOpenOpportunities)
    opportunities;
    
    searchKey = '';
    sortBy = '';
    sortDirection = 'asc';
    page = 1;
    pageSize = 10;
    
    handleSearchKeyChange(event) {
        window.clearTimeout(this.delayTimeout);
        const searchKey = event.target.value;
        // eslint-disable-next-line @lwc/lwc/no-async-operation
        this.delayTimeout = setTimeout(() => {
            this.searchKey = searchKey;
        }, 300);
    }

    handleSortByChange(event) {
        this.sortBy = event.target.value;
    }

    handleSortDirectionChange(event) {
        this.sortDirection = event.target.value;
    }
    
    handlePageChange(event) {
        this.page = event.target.value;
    }
    
    handlePageSizeChange(event) {
        this.pageSize = event.target.value;
    }
}