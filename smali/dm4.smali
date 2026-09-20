.class public final Ldm4;
.super Lcr4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final d:Lfm4;


# direct methods
.method public constructor <init>(Lfm4;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lpf8;->b:Lvt7;

    .line 5
    .line 6
    iget-object v1, p1, Lfm4;->a:Ljava/util/List;

    .line 7
    .line 8
    const-string v2, "monthName"

    .line 9
    .line 10
    invoke-direct {p0, v0, v1, v2}, Lcr4;-><init>(Lvt7;Ljava/util/List;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldm4;->d:Lfm4;

    .line 14
    .line 15
    return-void
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
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ldm4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldm4;->d:Lfm4;

    .line 6
    .line 7
    iget-object p0, p0, Lfm4;->a:Ljava/util/List;

    .line 8
    .line 9
    check-cast p1, Ldm4;

    .line 10
    .line 11
    iget-object p1, p1, Ldm4;->d:Lfm4;

    .line 12
    .line 13
    iget-object p1, p1, Lfm4;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldm4;->d:Lfm4;

    .line 2
    .line 3
    iget-object p0, p0, Lfm4;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
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
