.class public final Lib3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhl;


# instance fields
.field public final a:Lv02;

.field public final b:Lo46;


# direct methods
.method public constructor <init>(Lv02;Lo46;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lib3;->a:Lv02;

    .line 5
    .line 6
    iput-object p2, p0, Lib3;->b:Lo46;

    .line 7
    .line 8
    instance-of p0, p1, Ljo7;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p1, Ljo7;

    .line 13
    .line 14
    iget p0, p1, Ljo7;->a:I

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Ljo7;->b:I

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of p0, p1, Lhx6;

    .line 24
    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    check-cast p1, Lhx6;

    .line 28
    .line 29
    iget p0, p1, Lhx6;->a:I

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void

    .line 34
    :cond_2
    const-string p0, "Animation to be infinitely repeated cannot have a 0-duration"

    .line 35
    .line 36
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0

    .line 41
    :cond_3
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method


# virtual methods
.method public final a(Llo7;)Lm38;
    .locals 2

    .line 1
    new-instance v0, Lr38;

    .line 2
    .line 3
    iget-object v1, p0, Lib3;->a:Lv02;

    .line 4
    .line 5
    invoke-interface {v1, p1}, Lv02;->a(Llo7;)Lo38;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lib3;->b:Lo46;

    .line 10
    .line 11
    invoke-direct {v0, p1, p0}, Lr38;-><init>(Lo38;Lo46;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lib3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lib3;

    .line 6
    .line 7
    iget-object v0, p1, Lib3;->a:Lv02;

    .line 8
    .line 9
    iget-object v1, p0, Lib3;->a:Lv02;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lib3;->b:Lo46;

    .line 18
    .line 19
    iget-object p0, p0, Lib3;->b:Lo46;

    .line 20
    .line 21
    if-ne p1, p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
    .line 27
    .line 28
    .line 29
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lib3;->a:Lv02;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lib3;->b:Lo46;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    mul-int/lit8 p0, p0, 0x1f

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, p0

    .line 25
    return v0
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
