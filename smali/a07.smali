.class public final La07;
.super Lf56;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>([BLjava/util/concurrent/atomic/AtomicLong;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La07;->b:[B

    .line 5
    .line 6
    iput-object p2, p0, La07;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 7
    .line 8
    return-void
    .line 9
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
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
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object p0, p0, La07;->b:[B

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    int-to-long v0, p0

    .line 5
    return-wide v0
    .line 6
    .line 7
    .line 8
    .line 9
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

.method public final b()Lyh4;
    .locals 0

    .line 1
    sget-object p0, Lyh4;->e:Lk26;

    .line 2
    .line 3
    const-string p0, "application/octet-stream"

    .line 4
    .line 5
    invoke-static {p0}, Lie1;->G(Ljava/lang/String;)Lyh4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

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

.method public final d(Ldd0;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, La07;->b:[B

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    sub-int/2addr v2, v0

    .line 9
    const v3, 0x8000

    .line 10
    .line 11
    .line 12
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-interface {p1, v1, v0, v2}, Ldd0;->write([BII)Ldd0;

    .line 17
    .line 18
    .line 19
    add-int/2addr v0, v2

    .line 20
    iget-object v1, p0, La07;->c:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    int-to-long v2, v2

    .line 23
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
    .line 28
    .line 29
.end method
