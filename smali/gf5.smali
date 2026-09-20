.class public final Lgf5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ljava/util/Optional;

.field public final c:Ljava/util/Optional;

.field public final d:Ljava/util/Optional;

.field public final e:Lns3;


# direct methods
.method public constructor <init>(Lo9;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    iget-object v1, p1, Lo9;->x:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lgf5;->a:Ljava/util/Set;

    .line 18
    .line 19
    iget-object v0, p1, Lo9;->y:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/Optional;

    .line 22
    .line 23
    iput-object v0, p0, Lgf5;->b:Ljava/util/Optional;

    .line 24
    .line 25
    iget-object v0, p1, Lo9;->z:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/Optional;

    .line 28
    .line 29
    iput-object v0, p0, Lgf5;->c:Ljava/util/Optional;

    .line 30
    .line 31
    iget-object v0, p1, Lo9;->A:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/Optional;

    .line 34
    .line 35
    iput-object v0, p0, Lgf5;->d:Ljava/util/Optional;

    .line 36
    .line 37
    iget-object p1, p1, Lo9;->B:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lns3;

    .line 40
    .line 41
    const-string v0, "Peers must have a public key"

    .line 42
    .line 43
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lgf5;->e:Lns3;

    .line 47
    .line 48
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lgf5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lgf5;

    .line 8
    .line 9
    iget-object v0, p0, Lgf5;->a:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v2, p1, Lgf5;->a:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lgf5;->b:Ljava/util/Optional;

    .line 20
    .line 21
    iget-object v2, p1, Lgf5;->b:Ljava/util/Optional;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lgf5;->c:Ljava/util/Optional;

    .line 30
    .line 31
    iget-object v2, p1, Lgf5;->c:Ljava/util/Optional;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, Lgf5;->d:Ljava/util/Optional;

    .line 40
    .line 41
    iget-object v2, p1, Lgf5;->d:Ljava/util/Optional;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/Optional;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object p0, p0, Lgf5;->e:Lns3;

    .line 50
    .line 51
    iget-object p1, p1, Lgf5;->e:Lns3;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lns3;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_1
    return v1
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lgf5;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lgf5;->b:Ljava/util/Optional;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/Optional;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lgf5;->c:Ljava/util/Optional;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/Optional;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget-object v1, p0, Lgf5;->d:Ljava/util/Optional;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/Optional;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    mul-int/lit8 v1, v1, 0x1f

    .line 37
    .line 38
    iget-object p0, p0, Lgf5;->e:Lns3;

    .line 39
    .line 40
    invoke-virtual {p0}, Lns3;->hashCode()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    add-int/2addr p0, v1

    .line 45
    return p0
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

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "(Peer "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lgf5;->e:Lns3;

    .line 9
    .line 10
    invoke-virtual {v1}, Lns3;->d()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lkf3;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, v2, v0}, Lkf3;-><init>(ILjava/lang/StringBuilder;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lgf5;->b:Ljava/util/Optional;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Ljava/util/Optional;->ifPresent(Ljava/util/function/Consumer;)V

    .line 26
    .line 27
    .line 28
    const/16 p0, 0x29

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
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
