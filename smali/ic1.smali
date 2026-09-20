.class public final Lic1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcm7;


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lic1;->b:I

    .line 5
    .line 6
    if-lez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "durationMillis must be > 0."

    .line 10
    .line 11
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
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
.method public final a(Lrt;Lt83;)Llm7;
    .locals 2

    .line 1
    instance-of v0, p2, Lf77;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lm05;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lm05;-><init>(Lrt;Lt83;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    move-object v0, p2

    .line 12
    check-cast v0, Lf77;

    .line 13
    .line 14
    iget-object v0, v0, Lf77;->c:Lpe1;

    .line 15
    .line 16
    sget-object v1, Lpe1;->w:Lpe1;

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    new-instance p0, Lm05;

    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, Lm05;-><init>(Lrt;Lt83;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    new-instance v0, Ljc1;

    .line 27
    .line 28
    iget p0, p0, Lic1;->b:I

    .line 29
    .line 30
    invoke-direct {v0, p1, p2, p0}, Ljc1;-><init>(Lrt;Lt83;I)V

    .line 31
    .line 32
    .line 33
    return-object v0
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

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lic1;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lic1;

    .line 10
    .line 11
    iget p1, p1, Lic1;->b:I

    .line 12
    .line 13
    iget p0, p0, Lic1;->b:I

    .line 14
    .line 15
    if-ne p0, p1, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    const/4 p0, 0x0

    .line 19
    return p0
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

.method public final hashCode()I
    .locals 1

    .line 1
    iget p0, p0, Lic1;->b:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0x1f

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/2addr v0, p0

    .line 11
    return v0
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
