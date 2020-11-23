//todo - add licence information to all the classes

package org.relxd.lxd.builders;

import org.relxd.lxd.model.CreateInstancesRequestConfigValue;

import java.sql.Blob;
import java.util.HashMap;
import java.util.Map;

/**
 * https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration
 * This class is used to provide config information which will be used during container creation.
 */
public class InstanceConfigBuilder {

    private Map<String, CreateInstancesRequestConfigValue> configs = new HashMap<>();

    /**
     * Always start the instance when LXD starts (if not set, restore last state)
     * Live Update: N/A
     * @param bootAutoStart
     * @return
     */
    public InstanceConfigBuilder setBootAutoStart(boolean bootAutoStart) {
        configs.put("boot.autostart", new CreateInstancesRequestConfigValue().configValueToSet(bootAutoStart));
        return this;
    }

    public InstanceConfigBuilder setBootAutoStartDelay(int bootAutoStartDelay) {
        configs.put("boot.autostart.delay", new CreateInstancesRequestConfigValue().configValueToSet(bootAutoStartDelay));
        return this;
    }

    public InstanceConfigBuilder setBootAutoStartPriority(int bootAutoStartPriority) {
        configs.put("boot.autostart.priority", new CreateInstancesRequestConfigValue().configValueToSet(bootAutoStartPriority));
        return this;
    }

    public InstanceConfigBuilder setBootHostShutdownTimeout(int bootHostShutdownTimeout) {
        configs.put("boot.host_shutdown_timeout", new CreateInstancesRequestConfigValue().configValueToSet(bootHostShutdownTimeout));
        return this;
    }
    public InstanceConfigBuilder setBootStopPriority(boolean bootStopPriority) {
        configs.put("boot.stop.priority", new CreateInstancesRequestConfigValue().configValueToSet(bootStopPriority));
        return this;
    }
    public InstanceConfigBuilder setEnvironment(String   environment) {
        configs.put("environment.*", new CreateInstancesRequestConfigValue().configValueToSet(environment));
        return this;
    }
    public InstanceConfigBuilder setLimitsCpu(String limitsCpu) {
        configs.put("limits.cpu", new CreateInstancesRequestConfigValue().configValueToSet(limitsCpu));
        return this;
    }
    public InstanceConfigBuilder setLimitsCpuAllowance(String limitsCpuAllowance) {
        configs.put("limits.cpu.allowance", new CreateInstancesRequestConfigValue().configValueToSet(limitsCpuAllowance));
        return this;
    }
    public InstanceConfigBuilder setLimitsCpuPriority(int limitsCpuPriority) {
        configs.put("limits.cpu.priority", new CreateInstancesRequestConfigValue().configValueToSet(limitsCpuPriority));
        return this;
    }
    public InstanceConfigBuilder setLimitsDiskPriority(int limitsDiskPriority) {
        configs.put("limits.disk.priority", new CreateInstancesRequestConfigValue().configValueToSet(limitsDiskPriority));
        return this;
    }
    public InstanceConfigBuilder setLimitsHugepages64KB(String limitsHugepages64KB) {
        configs.put("limits.hugepages.64KB", new CreateInstancesRequestConfigValue().configValueToSet(limitsHugepages64KB));
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages1MB(String limitsHugepages1MB) {
        configs.put("limits.hugepages.1MB", new CreateInstancesRequestConfigValue().configValueToSet(limitsHugepages1MB));
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages2MB(String limitsHugepages2MB) {
        configs.put("limits.hugepages.2MB", new CreateInstancesRequestConfigValue().configValueToSet(limitsHugepages2MB));
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages1GB(String limitsHugepages1GB) {
        configs.put("limits.hugepages.1GB", new CreateInstancesRequestConfigValue().configValueToSet(limitsHugepages1GB));
        return this;
    }

    public InstanceConfigBuilder setLimitsKernel(String limitsKernel) {
        configs.put("limits.kernel.*", new CreateInstancesRequestConfigValue().configValueToSet(limitsKernel));
        return this;
    }

    public InstanceConfigBuilder setLimitsMemory(String limitsMemory) {
        configs.put("limits.memory", new CreateInstancesRequestConfigValue().configValueToSet(limitsMemory));
        return this;
    }

    public InstanceConfigBuilder setLimitsMemoryEnforce(String limitsMemoryEnforce) {
        configs.put("limits.memory.enforce", new CreateInstancesRequestConfigValue().configValueToSet(limitsMemoryEnforce));
        return this;
    }

    public InstanceConfigBuilder setLimitsMemoryHugepages(boolean limitsMemoryHugepages) {
        configs.put("limits.memory.hugepages", new CreateInstancesRequestConfigValue().configValueToSet(limitsMemoryHugepages));
        return this;
    }

    public InstanceConfigBuilder setLimitsMemorySwap(boolean limitsMemorySwap) {
        configs.put("limits.memory.swap", new CreateInstancesRequestConfigValue().configValueToSet(limitsMemorySwap));
        return this;
    }

    public InstanceConfigBuilder setLimitsMemorySwapPriority(int limitsMemorySwapPriority) {
        configs.put("limits.memory.swap.priority", new CreateInstancesRequestConfigValue().configValueToSet(limitsMemorySwapPriority));
        return this;
    }

    public InstanceConfigBuilder setLimitsNetworkPriority(int limitsNetworkPriority) {
        configs.put("limits.network.priority", new CreateInstancesRequestConfigValue().configValueToSet(limitsNetworkPriority));
        return this;
    }

    public InstanceConfigBuilder setLimitsProcesses(int limitsProcesses) {
        configs.put("limits.processes", new CreateInstancesRequestConfigValue().configValueToSet(limitsProcesses));
        return this;
    }

    public InstanceConfigBuilder setLinuxKernelModules(String linuxKernelModules) {
        configs.put("linux.kernel_modules", new CreateInstancesRequestConfigValue().configValueToSet(linuxKernelModules));
        return this;
    }

    public InstanceConfigBuilder setMigrationIncrementalMemory(boolean migrationIncrementalMemory) {
        configs.put("migration.incremental.memory", new CreateInstancesRequestConfigValue().configValueToSet(migrationIncrementalMemory));
        return this;
    }

    public InstanceConfigBuilder setMigrationIncrementalMemoryGoal(int migrationIncrementalMemoryGoal) {
        configs.put("migration.incremental.memory.goal", new CreateInstancesRequestConfigValue().configValueToSet(migrationIncrementalMemoryGoal));
        return this;
    }

    public InstanceConfigBuilder setmigrationIncrementalMemoryIterations(int migrationIncrementalMemoryIterations) {
        configs.put("migration.incremental.memory.iterations", new CreateInstancesRequestConfigValue().configValueToSet(migrationIncrementalMemoryIterations));
        return this;
    }

    public InstanceConfigBuilder setNvidiaDriverCapabilities(String nvidiaDriverCapabilities) {
        configs.put("nvidia.driver.capabilities", new CreateInstancesRequestConfigValue().configValueToSet(nvidiaDriverCapabilities));
        return this;
    }

    public InstanceConfigBuilder setNvidiaRequireCuda(String nvidiaRequireCuda) {
        configs.put("nvidia.require.cuda", new CreateInstancesRequestConfigValue().configValueToSet(nvidiaRequireCuda));
        return this;
    }

    public InstanceConfigBuilder setNvidiaRequireDriver(String nvidiaRequireDriver) {
        configs.put("nvidia.require.driver", new CreateInstancesRequestConfigValue().configValueToSet(nvidiaRequireDriver));
        return this;
    }

    public InstanceConfigBuilder setNvidiaRuntime(boolean nvidiaRuntime) {
        configs.put("nvidia.runtime", new CreateInstancesRequestConfigValue().configValueToSet(nvidiaRuntime));
        return this;
    }

    public InstanceConfigBuilder setRawApparmor(Blob rawApparmor) {
        configs.put("raw.apparmor", new CreateInstancesRequestConfigValue().configValueToSet(rawApparmor));
        return this;
    }

    public InstanceConfigBuilder setRawIdmap(Blob rawIdmap) {
        configs.put("raw.idmap", new CreateInstancesRequestConfigValue().configValueToSet(rawIdmap));
        return this;
    }

    public InstanceConfigBuilder setRawLxc(Blob rawLxc) {
        configs.put("raw.lxc", new CreateInstancesRequestConfigValue().configValueToSet(rawLxc));
        return this;
    }

    public InstanceConfigBuilder setRawQemu(Blob rawQemu) {
        configs.put("raw.qemu", new CreateInstancesRequestConfigValue().configValueToSet(rawQemu));
        return this;
    }

    public InstanceConfigBuilder setRawSeccomp(Blob rawSeccomp) {
        configs.put("raw.seccomp", new CreateInstancesRequestConfigValue().configValueToSet(rawSeccomp));
        return this;
    }

    public InstanceConfigBuilder setSecurityDevlxd(boolean securityDevlxd) {
        configs.put("security.devlxd", new CreateInstancesRequestConfigValue().configValueToSet(securityDevlxd));
        return this;
    }

    public InstanceConfigBuilder setSecurityDevlxdImages(boolean securityDevlxdImages) {
        configs.put("security.devlxd.images", new CreateInstancesRequestConfigValue().configValueToSet(securityDevlxdImages));
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapBase(int securityIdmapBase) {
        configs.put("security.idmap.base", new CreateInstancesRequestConfigValue().configValueToSet(securityIdmapBase));
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapIsolated(boolean securityIdmapIsolated) {
        configs.put("security.idmap.isolated", new CreateInstancesRequestConfigValue().configValueToSet(securityIdmapIsolated));
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapSize(int securityIdmapSize) {
        configs.put("security.idmap.size", new CreateInstancesRequestConfigValue().configValueToSet(securityIdmapSize));
        return this;
    }

    public InstanceConfigBuilder setSecurityNesting(boolean securityNesting) {
        configs.put("security.nesting", new CreateInstancesRequestConfigValue().configValueToSet(securityNesting));
        return this;
    }

    public InstanceConfigBuilder setSecurityPrivileged(boolean securityPrivileged) {
        configs.put("security.privileged", new CreateInstancesRequestConfigValue().configValueToSet(securityPrivileged));
        return this;
    }

    public InstanceConfigBuilder setSecurityProtectionDelete(boolean securityProtectionDelete) {
        configs.put("security.protection.delete", new CreateInstancesRequestConfigValue().configValueToSet(securityProtectionDelete));
        return this;
    }

    public InstanceConfigBuilder setSecurityProtectionShift(boolean securityProtectionShift) {
        configs.put("security.protection.shift", new CreateInstancesRequestConfigValue().configValueToSet(securityProtectionShift));
        return this;
    }

    public InstanceConfigBuilder setSecuritySecureboot(boolean securitySecureboot) {
        configs.put("security.secureboot", new CreateInstancesRequestConfigValue().configValueToSet(securitySecureboot));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsAllow(String securitySyscallsAllow) {
        configs.put("security.syscalls.allow", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsAllow));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDeny(String securitySyscallsDeny) {
        configs.put("security.syscalls.deny", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsDeny));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDenyCompat(boolean  securitySyscallsDenyCompat) {
        configs.put("security.syscalls.deny_compat", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsDenyCompat));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDenyDefault(boolean securitySyscallsDenyDefault) {
        configs.put("security.syscalls.deny_default", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsDenyDefault));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptBpf(boolean securitySyscallsInterceptBpf) {
        configs.put("security.syscalls.intercept.bpf", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptBpf));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptBpfDevices(boolean securitySyscallsInterceptBpfDevices) {
        configs.put("security.syscalls.intercept.bpf.devices", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptBpfDevices));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMknod(boolean securitySyscallsInterceptMknod) {
        configs.put("security.syscalls.intercept.mknod", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptMknod));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMount(boolean securitySyscallsInterceptMount) {
        configs.put("security.syscalls.intercept.mount", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptMount));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountAllowed(String securitySyscallsInterceptMountAllowed) {
        configs.put("security.syscalls.intercept.mount.allowed", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptMountAllowed));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountFuse(String securitySyscallsInterceptMountFuse) {
        configs.put("security.syscalls.intercept.mount.fuse", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptMountFuse));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountShift(boolean securitySyscallsInterceptMountShift) {
        configs.put("security.syscalls.intercept.mount.shift", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptMountShift));
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptSetxattr(boolean securitySyscallsInterceptSetxattr) {
        configs.put("security.syscalls.intercept.setxattr", new CreateInstancesRequestConfigValue().configValueToSet(securitySyscallsInterceptSetxattr));
        return this;
    }

    public InstanceConfigBuilder setSnapshotsSchedule(String snapshotsSchedule) {
        configs.put("snapshots.schedule", new CreateInstancesRequestConfigValue().configValueToSet(snapshotsSchedule));
        return this;
    }

    public InstanceConfigBuilder setSnapshotsScheduleStopped(boolean snapshotsScheduleStopped) {
        configs.put("snapshots.schedule.stopped", new CreateInstancesRequestConfigValue().configValueToSet(snapshotsScheduleStopped));
        return this;
    }

    public InstanceConfigBuilder setSnapshotsPattern(String snapshotsPattern) {
        configs.put("snapshots.pattern", new CreateInstancesRequestConfigValue().configValueToSet(snapshotsPattern));
        return this;
    }

    public InstanceConfigBuilder setSnapshotsExpiry(String snapshotsExpiry) {
        configs.put("snapshots.expiry", new CreateInstancesRequestConfigValue().configValueToSet(snapshotsExpiry));
        return this;
    }

    public InstanceConfigBuilder setUser(String user) {
        configs.put("user.*", new CreateInstancesRequestConfigValue().configValueToSet(user));
        return this;
    }

    public Map<String, CreateInstancesRequestConfigValue> asMap () {
            return configs;
    }
}
