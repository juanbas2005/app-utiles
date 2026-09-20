.class public abstract Ls43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lq43;


# static fields
.field public static final synthetic y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public volatile synthetic clientRefCount$internal:I

.field private volatile synthetic closed:I

.field public final w:Lz97;

.field public final x:Lz97;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "closed"

    .line 2
    .line 3
    const-class v1, Ls43;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ls43;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    const-string v0, "clientRefCount$internal"

    .line 12
    .line 13
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ls43;->z:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ls43;->closed:I

    .line 6
    .line 7
    iput v0, p0, Ls43;->clientRefCount$internal:I

    .line 8
    .line 9
    new-instance v0, Lr43;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lr43;-><init>(Ls43;I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lz97;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Ls43;->w:Lz97;

    .line 21
    .line 22
    new-instance v0, Lr43;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, v1}, Lr43;-><init>(Ls43;I)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lz97;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lz97;-><init>(Lsr2;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Ls43;->x:Lz97;

    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Ls43;->y:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Ls43;->k()Le81;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Lme6;->E:Lme6;

    .line 17
    .line 18
    invoke-interface {p0, v0}, Le81;->a0(Ld81;)Lc81;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    instance-of v0, p0, Lfl3;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Lfl3;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    :goto_0
    if-nez p0, :cond_2

    .line 31
    .line 32
    :goto_1
    return-void

    .line 33
    :cond_2
    invoke-virtual {p0}, Lfl3;->v0()V

    .line 34
    .line 35
    .line 36
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public k()Le81;
    .locals 0

    .line 1
    iget-object p0, p0, Ls43;->x:Lz97;

    .line 2
    .line 3
    invoke-virtual {p0}, Lz97;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Le81;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
