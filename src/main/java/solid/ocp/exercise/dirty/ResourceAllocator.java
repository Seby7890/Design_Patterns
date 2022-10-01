package solid.ocp.exercise.dirty;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceType resourceType) {
        int resourceId;

        switch (resourceType) {
            case TIME_SLOT -> {
                resourceId = findFreeTimeSlot();
                markTimeSlotBusy(resourceId);
            }
            case SPACE_SLOT -> {
                resourceId = findFreeSpaceSlot();
                markSpaceSlotBusy(resourceId);
            }
            default -> {
                System.out.println("ERROR: Attempted to allocate invalid resource");
                resourceId = INVALID_RESOURCE_ID;
            }
        }
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) {
        switch (resourceType) {
            case TIME_SLOT -> markTimeSlotFree(resourceId);
            case SPACE_SLOT -> markSpaceSlotFree(resourceId);
            default -> System.out.println("ERROR: attempted to free invalid resource");
        }
    }

    private void markSpaceSlotFree(int resourceId) {
    }

    private void markTimeSlotFree(int resourceId) {
    }

    private void markSpaceSlotBusy(int resourceId) {
    }

    private int findFreeSpaceSlot() {
        return 0;
    }

    private void markTimeSlotBusy(int resourceId) {
    }

    private int findFreeTimeSlot() {
        return 0;
    }
}