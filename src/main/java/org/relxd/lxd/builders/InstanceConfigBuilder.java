//todo - add licence information to all the classes

package org.relxd.lxd.builders;

import java.sql.Blob;
import java.util.HashMap;
import java.util.Map;

/**
 * https://github.com/lxc/lxd/blob/master/doc/instances.md#keyvalue-configuration
 * This class is used to provide config information which will be used during container creation.
 */
public class InstanceConfigBuilder {

    private Map<String, Object> configs = new HashMap<>();

    /**
     * Always start the instance when LXD starts (if not set, restore last state)
     * Live Update: N/A
     * @param bootAutoStart
     * @return
     */
    public InstanceConfigBuilder setBootAutoStart(boolean bootAutoStart) {
        configs.put("boot.autostart", String.valueOf(bootAutoStart));
        return this;
    }

    public InstanceConfigBuilder setBootAutoStartDelay(int bootAutoStartDelay) {
        configs.put("boot.autostart.delay", bootAutoStartDelay);
        return this;
    }

    public InstanceConfigBuilder setBootAutoStartPriority(int bootAutoStartPriority) {
        configs.put("boot.autostart.priority", bootAutoStartPriority);
        return this;
    }

    public InstanceConfigBuilder setBootHostShutdownTimeout(int bootHostShutdownTimeout) {
        configs.put("boot.host_shutdown_timeout", bootHostShutdownTimeout);
        return this;
    }
    public InstanceConfigBuilder setBootStopPriority(boolean bootStopPriority) {
        configs.put("boot.stop.priority", bootStopPriority);
        return this;
    }
    public InstanceConfigBuilder setEnvironment(String   environment) {
        configs.put("environment.*", environment);
        return this;
    }
    public InstanceConfigBuilder setLimitsCpu(String limitsCpu) {
        configs.put("limits.cpu", limitsCpu);
        return this;
    }
    public InstanceConfigBuilder setLimitsCpuAllowance(String limitsCpuAllowance) {
        configs.put("limits.cpu.allowance", limitsCpuAllowance);
        return this;
    }
    public InstanceConfigBuilder setLimitsCpuPriority(int limitsCpuPriority) {
        configs.put("limits.cpu.priority", limitsCpuPriority);
        return this;
    }
    public InstanceConfigBuilder setLimitsDiskPriority(int limitsDiskPriority) {
        configs.put("limits.disk.priority", limitsDiskPriority);
        return this;
    }
    public InstanceConfigBuilder setLimitsHugepages64KB(String limitsHugepages64KB) {
        configs.put("limits.hugepages.64KB", limitsHugepages64KB);
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages1MB(String limitsHugepages1MB) {
        configs.put("limits.hugepages.1MB", limitsHugepages1MB);
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages2MB(String limitsHugepages2MB) {
        configs.put("limits.hugepages.2MB", limitsHugepages2MB);
        return this;
    }

    public InstanceConfigBuilder setLimitsHugepages1GB(String limitsHugepages1GB) {
        configs.put("limits.hugepages.1GB", limitsHugepages1GB);
        return this;
    }

    public InstanceConfigBuilder setLimitsKernel(String limitsKernel) {
        configs.put("limits.kernel.*", limitsKernel);
        return this;
    }

    public InstanceConfigBuilder setLimitsMemory(String limitsMemory) {
        configs.put("limits.memory", limitsMemory);
        return this;
    }

    public InstanceConfigBuilder setLimitsMemoryEnforce(String limitsMemoryEnforce) {
        configs.put("limits.memory.enforce", limitsMemoryEnforce);
        return this;
    }

    public InstanceConfigBuilder setLimitsMemoryHugepages(boolean limitsMemoryHugepages) {
        configs.put("limits.memory.hugepages", limitsMemoryHugepages);
        return this;
    }

    public InstanceConfigBuilder setLimitsMemorySwap(boolean limitsMemorySwap) {
        configs.put("limits.memory.swap", limitsMemorySwap);
        return this;
    }

    public InstanceConfigBuilder setLimitsMemorySwapPriority(int limitsMemorySwapPriority) {
        configs.put("limits.memory.swap.priority", limitsMemorySwapPriority);
        return this;
    }

    public InstanceConfigBuilder setLimitsNetworkPriority(int limitsNetworkPriority) {
        configs.put("limits.network.priority", limitsNetworkPriority);
        return this;
    }

    public InstanceConfigBuilder setLimitsProcesses(int limitsProcesses) {
        configs.put("limits.processes", limitsProcesses);
        return this;
    }

    public InstanceConfigBuilder setLinuxKernelModules(String linuxKernelModules) {
        configs.put("linux.kernel_modules", linuxKernelModules);
        return this;
    }

    public InstanceConfigBuilder setMigrationIncrementalMemory(boolean migrationIncrementalMemory) {
        configs.put("migration.incremental.memory", migrationIncrementalMemory);
        return this;
    }

    public InstanceConfigBuilder setMigrationIncrementalMemoryGoal(int migrationIncrementalMemoryGoal) {
        configs.put("migration.incremental.memory.goal", migrationIncrementalMemoryGoal);
        return this;
    }

    public InstanceConfigBuilder setmigrationIncrementalMemoryIterations(int migrationIncrementalMemoryIterations) {
        configs.put("migration.incremental.memory.iterations", migrationIncrementalMemoryIterations);
        return this;
    }

    public InstanceConfigBuilder setNvidiaDriverCapabilities(String nvidiaDriverCapabilities) {
        configs.put("nvidia.driver.capabilities", nvidiaDriverCapabilities);
        return this;
    }

    public InstanceConfigBuilder setNvidiaRequireCuda(String nvidiaRequireCuda) {
        configs.put("nvidia.require.cuda", nvidiaRequireCuda);
        return this;
    }

    public InstanceConfigBuilder setNvidiaRequireDriver(String nvidiaRequireDriver) {
        configs.put("nvidia.require.driver", nvidiaRequireDriver);
        return this;
    }

    public InstanceConfigBuilder setNvidiaRuntime(boolean nvidiaRuntime) {
        configs.put("nvidia.runtime", nvidiaRuntime);
        return this;
    }

    public InstanceConfigBuilder setRawApparmor(Blob rawApparmor) {
        configs.put("raw.apparmor", rawApparmor);
        return this;
    }

    public InstanceConfigBuilder setRawIdmap(Blob rawIdmap) {
        configs.put("raw.idmap", rawIdmap);
        return this;
    }

    public InstanceConfigBuilder setRawLxc(Blob rawLxc) {
        configs.put("raw.lxc", rawLxc);
        return this;
    }

    public InstanceConfigBuilder setRawQemu(Blob rawQemu) {
        configs.put("raw.qemu", rawQemu);
        return this;
    }

    public InstanceConfigBuilder setRawSeccomp(Blob rawSeccomp) {
        configs.put("raw.seccomp", rawSeccomp);
        return this;
    }

    public InstanceConfigBuilder setSecurityDevlxd(boolean securityDevlxd) {
        configs.put("security.devlxd", securityDevlxd);
        return this;
    }

    public InstanceConfigBuilder setSecurityDevlxdImages(boolean securityDevlxdImages) {
        configs.put("security.devlxd.images", securityDevlxdImages);
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapBase(int securityIdmapBase) {
        configs.put("security.idmap.base", securityIdmapBase);
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapIsolated(boolean securityIdmapIsolated) {
        configs.put("security.idmap.isolated", securityIdmapIsolated);
        return this;
    }

    public InstanceConfigBuilder setSecurityIdmapSize(int securityIdmapSize) {
        configs.put("security.idmap.size", securityIdmapSize);
        return this;
    }

    public InstanceConfigBuilder setSecurityNesting(boolean securityNesting) {
        configs.put("security.nesting", securityNesting);
        return this;
    }

    public InstanceConfigBuilder setSecurityPrivileged(boolean securityPrivileged) {
        configs.put("security.privileged", securityPrivileged);
        return this;
    }

    public InstanceConfigBuilder setSecurityProtectionDelete(boolean securityProtectionDelete) {
        configs.put("security.protection.delete", securityProtectionDelete);
        return this;
    }

    public InstanceConfigBuilder setSecurityProtectionShift(boolean securityProtectionShift) {
        configs.put("security.protection.shift", securityProtectionShift);
        return this;
    }

    public InstanceConfigBuilder setSecuritySecureboot(boolean securitySecureboot) {
        configs.put("security.secureboot", securitySecureboot);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsAllow(String securitySyscallsAllow) {
        configs.put("security.syscalls.allow", securitySyscallsAllow);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDeny(String securitySyscallsDeny) {
        configs.put("security.syscalls.deny", securitySyscallsDeny);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDenyCompat(boolean  securitySyscallsDenyCompat) {
        configs.put("security.syscalls.deny_compat", securitySyscallsDenyCompat);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsDenyDefault(boolean securitySyscallsDenyDefault) {
        configs.put("security.syscalls.deny_default", securitySyscallsDenyDefault);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptBpf(boolean securitySyscallsInterceptBpf) {
        configs.put("security.syscalls.intercept.bpf", securitySyscallsInterceptBpf);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptBpfDevices(boolean securitySyscallsInterceptBpfDevices) {
        configs.put("security.syscalls.intercept.bpf.devices", securitySyscallsInterceptBpfDevices);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMknod(boolean securitySyscallsInterceptMknod) {
        configs.put("security.syscalls.intercept.mknod", securitySyscallsInterceptMknod);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMount(boolean securitySyscallsInterceptMount) {
        configs.put("security.syscalls.intercept.mount", securitySyscallsInterceptMount);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountAllowed(String securitySyscallsInterceptMountAllowed) {
        configs.put("security.syscalls.intercept.mount.allowed", securitySyscallsInterceptMountAllowed);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountFuse(String securitySyscallsInterceptMountFuse) {
        configs.put("security.syscalls.intercept.mount.fuse", securitySyscallsInterceptMountFuse);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptMountShift(boolean securitySyscallsInterceptMountShift) {
        configs.put("security.syscalls.intercept.mount.shift", securitySyscallsInterceptMountShift);
        return this;
    }

    public InstanceConfigBuilder setSecuritySyscallsInterceptSetxattr(boolean securitySyscallsInterceptSetxattr) {
        configs.put("security.syscalls.intercept.setxattr", securitySyscallsInterceptSetxattr);
        return this;
    }

    public InstanceConfigBuilder setSnapshotsSchedule(String snapshotsSchedule) {
        configs.put("snapshots.schedule", snapshotsSchedule);
        return this;
    }

    public InstanceConfigBuilder setSnapshotsScheduleStopped(boolean snapshotsScheduleStopped) {
        configs.put("snapshots.schedule.stopped", snapshotsScheduleStopped);
        return this;
    }

    public InstanceConfigBuilder setSnapshotsPattern(String snapshotsPattern) {
        configs.put("snapshots.pattern", snapshotsPattern);
        return this;
    }

    public InstanceConfigBuilder setSnapshotsExpiry(String snapshotsExpiry) {
        configs.put("snapshots.expiry", snapshotsExpiry);
        return this;
    }

    public InstanceConfigBuilder setUser(String user) {
        configs.put("user.*", user);
        return this;
    }

    public Map<String, Object> asMap () {
            return configs;
    }
}
